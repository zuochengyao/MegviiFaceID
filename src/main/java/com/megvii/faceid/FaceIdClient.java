package com.megvii.faceid;

import com.megvii.faceid.model.base.request.BaseKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.model.base.request.BaseSignRequest;
import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.model.ocr.idcard.v1.IDCardV1Request;
import com.megvii.faceid.model.ocr.idcard.v1.IDCardV1Response;
import com.megvii.faceid.model.ocr.idcard.v2.IDCardV2Request;
import com.megvii.faceid.model.ocr.idcard.v2.IDCardV2Response;
import com.megvii.faceid.network.HttpConfig;
import com.megvii.faceid.network.HttpManager;
import com.megvii.faceid.network.HttpRequest;
import com.megvii.faceid.network.HttpResponse;
import com.megvii.faceid.util.JsonUtils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class FaceIdClient
{
    private final FaceIdConfig faceIdConfig;
    private final HttpManager httpManager;
    private FaceIdHost host = FaceIdHost.China;

    //    private HashMap<String, Object> KEY_MAP = new HashMap<>();

    public FaceIdClient(FaceIdConfig faceidConfig)
    {
        this(faceidConfig, HttpConfig.getDefault());
    }

    public FaceIdClient(FaceIdConfig faceidConfig, HttpConfig httpConfig)
    {
        this.faceIdConfig = faceidConfig;
        this.httpManager = new HttpManager(httpConfig);
    }

    public void setHost(FaceIdHost host)
    {
        this.host = host;
    }

    /**
     * 人脸检测 Detect
     *
     * https://faceid.com/pages/documents/4173042
     */
    public DetectResponse detect(DetectRequest req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        return JsonUtils.parse(response.getMessage(), DetectResponse.class);
    }

    /*
    保留异步请求
    public void detect(DetectRequest req, IFaceIdCallback<DetectResponse> callback) throws IOException
    {
        setKeyAndSecret(req);
        HttpRequest request = new HttpRequest(host.getHostUrl().concat(req.getUrl()), req);
        httpManager.enqueue(request);
    }
    */

    /**
     * 身份证 OCR V1.0.0
     * http://bj-faceid-prod-asset.oss-cn-beijing.aliyuncs.com/WIKI_SYNC_PICS/DOCS/OCRIDCard_v1.0.0.pdf
     */
    public IDCardV1Response idCardV1(IDCardV1Request req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        return JsonUtils.parse(response.getMessage(), IDCardV1Response.class);
    }

    /**
     * 身份证 OCR V2.0.0 推荐
     * https://faceid.com/pages/documents/10881005
     */
    public IDCardV2Response idCardV2(IDCardV2Request req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        return JsonUtils.parse(response.getMessage(), IDCardV2Response.class);
    }

    private HttpResponse doKeyRequest(@NotNull BaseKeyRequest model) throws IOException
    {
        model.setApiKey(faceIdConfig.getApiKey());
        model.setApiSecret(faceIdConfig.getApiSecret());
        return doInternalRequest(model);
    }

    private HttpResponse doSignRequest(@NotNull BaseSignRequest model) throws IOException
    {
        model.setSign(faceIdConfig.getApiSign());
        return doInternalRequest(model);
    }

    private HttpResponse doInternalRequest(BaseRequest model) throws IOException
    {
        model.toMap();
        HttpRequest request = new HttpRequest(host.getHostUrl().concat(model.getUrl()), model);
        return httpManager.execute(request);
    }
}
