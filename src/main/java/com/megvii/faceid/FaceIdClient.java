package com.megvii.faceid;

import com.megvii.faceid.model.base.auth.KeyRequest;
import com.megvii.faceid.model.base.auth.SignRequest;
import com.megvii.faceid.model.base.BaseRequest;
import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.model.ocr.bankcard.BankCardRequest;
import com.megvii.faceid.model.ocr.bankcard.BankCardResponse;
import com.megvii.faceid.model.ocr.idcard.v1.IdCardV1Request;
import com.megvii.faceid.model.ocr.idcard.v1.IdCardV1Response;
import com.megvii.faceid.model.ocr.idcard.v2.IdCardV2Request;
import com.megvii.faceid.model.ocr.idcard.v2.IdCardV2Response;
import com.megvii.faceid.model.pc.PcGetResultRequest;
import com.megvii.faceid.model.pc.PcGetResultResponse;
import com.megvii.faceid.model.pc.PcGetTokenRequest;
import com.megvii.faceid.model.pc.PcGetTokenResponse;
import com.megvii.faceid.model.verify.v2.VerifyV2Request;
import com.megvii.faceid.model.verify.v2.VerifyV2Response;
import com.megvii.faceid.model.verify.v3.GetBizTokenRequest;
import com.megvii.faceid.model.verify.v3.GetBizTokenResponse;
import com.megvii.faceid.model.verify.v3.VerifyV3Request;
import com.megvii.faceid.model.verify.v3.VerifyV3Response;
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
    public IdCardV1Response ocrIdCardV1(IdCardV1Request req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, IdCardV1Response.class);
    }

    /**
     * 身份证 OCR V2.0.0 推荐
     * https://faceid.com/pages/documents/10881005
     */
    public IdCardV2Response ocrIdCardV2(IdCardV2Request req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, IdCardV2Response.class);
    }

    public BankCardResponse ocrBankCard(BankCardRequest req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, BankCardResponse.class);
    }

    public GetBizTokenResponse appGetBizToken(GetBizTokenRequest req) throws IOException
    {
        HttpResponse response = doSignRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, GetBizTokenResponse.class);
    }

    public VerifyV3Response appVerifyV3(VerifyV3Request req) throws IOException
    {
        HttpResponse response = doSignRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, VerifyV3Response.class);
    }

    public VerifyV2Response appVerifyV2(VerifyV2Request req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, VerifyV2Response.class);
    }

    public PcGetTokenResponse pcGetToken(PcGetTokenRequest req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, PcGetTokenResponse.class);
    }

    public PcGetResultResponse pcGetResult(PcGetResultRequest req) throws IOException
    {
        HttpResponse response = doKeyRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, PcGetResultResponse.class);
    }

    private HttpResponse doKeyRequest(@NotNull KeyRequest model) throws IOException
    {
        model.setApiKey(faceIdConfig.getApiKey());
        model.setApiSecret(faceIdConfig.getApiSecret());
        return doInternalRequest(model);
    }

    private HttpResponse doSignRequest(@NotNull SignRequest model) throws IOException
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
