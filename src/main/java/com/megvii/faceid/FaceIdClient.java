package com.megvii.faceid;

import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.auth.ISignRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.model.lite.LiteGetResultRequest;
import com.megvii.faceid.model.lite.LiteGetResultResponse;
import com.megvii.faceid.model.lite.LiteGetTokenRequest;
import com.megvii.faceid.model.lite.LiteGetTokenResponse;
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
import com.megvii.faceid.model.raw.video.number.RawGetRandomNumberRequest;
import com.megvii.faceid.model.raw.video.number.RawGetRandomNumberResponse;
import com.megvii.faceid.model.raw.selfie.RawValidateFrontFaceRequest;
import com.megvii.faceid.model.raw.selfie.RawValidateFrontFaceResponse;
import com.megvii.faceid.model.raw.selfie.RawValidateSideFaceRequest;
import com.megvii.faceid.model.raw.selfie.RawValidateSideFaceResponse;
import com.megvii.faceid.model.raw.video.number.RawValidateVideoRequest;
import com.megvii.faceid.model.raw.video.number.RawValidateVideoResponse;
import com.megvii.faceid.model.raw.verify.RawVerifyRequest;
import com.megvii.faceid.model.raw.verify.RawVerifyResponse;
import com.megvii.faceid.model.raw.video.still.RawValidateStillRequest;
import com.megvii.faceid.model.raw.video.still.RawValidateStillResponse;
import com.megvii.faceid.model.verify.v2.VerifyV2Request;
import com.megvii.faceid.model.verify.v2.VerifyV2Response;
import com.megvii.faceid.model.verify.v3.GetBizTokenRequest;
import com.megvii.faceid.model.verify.v3.GetBizTokenResponse;
import com.megvii.faceid.model.verify.v3.VerifyV3Request;
import com.megvii.faceid.model.verify.v3.VerifyV3Response;
import com.megvii.faceid.http.HttpConfig;
import com.megvii.faceid.http.HttpManager;
import com.megvii.faceid.http.HttpRequest;
import com.megvii.faceid.http.HttpResponse;
import com.megvii.faceid.util.JsonUtils;

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
        HttpResponse response = doInternalRequest(req);
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
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, IdCardV1Response.class);
    }

    /**
     * 身份证 OCR V2.0.0 推荐
     * https://faceid.com/pages/documents/10881005
     */
    public IdCardV2Response ocrIdCardV2(IdCardV2Request req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, IdCardV2Response.class);
    }

    /**
     * 银行卡 OCR
     * https://faceid.com/pages/documents/10881161
     */
    public BankCardResponse ocrBankCard(BankCardRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, BankCardResponse.class);
    }

    /**
     * SDK - 获取 biz_token
     * https://faceid.com/pages/documents/37661898
     */
    public GetBizTokenResponse appGetBizToken(GetBizTokenRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, GetBizTokenResponse.class);
    }

    /**
     * Verify V3.0.0
     * https://faceid.com/pages/documents/37662519
     */
    public VerifyV3Response appVerifyV3(VerifyV3Request req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, VerifyV3Response.class);
    }

    /**
     * Verify V2.0.6
     * https://faceid.com/pages/documents/4173286
     */
    public VerifyV2Response appVerifyV2(VerifyV2Request req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, VerifyV2Response.class);
    }

    /**
     * PC 网页 KYC 验证服务 - 获取 token
     * https://faceid.com/pages/documents/5680502
     */
    public PcGetTokenResponse pcGetToken(PcGetTokenRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, PcGetTokenResponse.class);
    }

    /**
     * PC 网页 KYC 验证服务 - 获取验证结果
     * https://faceid.com/pages/documents/5680508
     */
    public PcGetResultResponse pcGetResult(PcGetResultRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, PcGetResultResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Lite - 获取 token
     * https://faceid.com/pages/documents/5680475
     */
    public LiteGetTokenResponse liteGetToken(LiteGetTokenRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, LiteGetTokenResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Lite - 获取验证结果
     * https://faceid.com/pages/documents/5680488
     */
    public LiteGetResultResponse liteGetResult(LiteGetResultRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, LiteGetResultResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Raw - 获取 token
     * https://faceid.com/pages/documents/7775613
     */
    public RawGetRandomNumberResponse rawGetRandomNumber(RawGetRandomNumberRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, RawGetRandomNumberResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Raw - 上传读数视频
     * https://faceid.com/pages/documents/7775631
     */
    public RawValidateVideoResponse rawValidateVideo(RawValidateVideoRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, RawValidateVideoResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Raw - 上传用户自拍正脸照片
     * https://faceid.com/pages/documents/7775665
     */
    public RawValidateFrontFaceResponse RawValidateFrontFace(RawValidateFrontFaceRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, RawValidateFrontFaceResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Raw - 验证用户的侧脸照片
     * https://faceid.com/pages/documents/7775684
     */
    public RawValidateSideFaceResponse RawValidateSideFace(RawValidateSideFaceRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, RawValidateSideFaceResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Raw - 上传静默视频
     * https://faceid.com/pages/documents/218677281
     */
    public RawValidateStillResponse RawValidateStill(RawValidateStillRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, RawValidateStillResponse.class);
    }

    /**
     * 移动端网页 KYC 验证服务 Raw - Verify 验证
     * https://faceid.com/pages/documents/7775652
     */
    public RawVerifyResponse rawVerify(RawVerifyRequest req) throws IOException
    {
        HttpResponse response = doInternalRequest(req);
        String message = response.getMessage();
        return JsonUtils.parse(message, RawVerifyResponse.class);
    }

    private HttpResponse doInternalRequest(BaseRequest model) throws IOException
    {
        if (model instanceof IKeyRequest)
        {
            ((IKeyRequest) model).setApiKey(faceIdConfig.getApiKey());
            ((IKeyRequest) model).setApiSecret(faceIdConfig.getApiSecret());
        }
        else if (model instanceof ISignRequest)
        {
            ((ISignRequest) model).setSign(faceIdConfig.getApiSign());
            ((ISignRequest) model).setSignVersion("hmac_sha1");
        }
        HttpRequest request = new HttpRequest();
        request.setUrl(this.host.getHostUrl().concat(model.getUrl()));
        request.setData(model.getParams());
        request.setHeader(model.headers());
        request.setHttpMethod(model.method());
        return httpManager.execute(request);
    }
}
