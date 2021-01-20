import com.megvii.faceid.FaceIdClient;
import com.megvii.faceid.FaceIdConfig;
import com.megvii.faceid.FaceIdHost;
import com.megvii.faceid.http.HttpConfig;
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
import com.megvii.faceid.model.raw.selfie.RawValidateFrontFaceRequest;
import com.megvii.faceid.model.raw.selfie.RawValidateFrontFaceResponse;
import com.megvii.faceid.model.raw.selfie.RawValidateSideFaceRequest;
import com.megvii.faceid.model.raw.selfie.RawValidateSideFaceResponse;
import com.megvii.faceid.model.raw.verify.RawVerifyRequest;
import com.megvii.faceid.model.raw.verify.RawVerifyResponse;
import com.megvii.faceid.model.raw.video.number.RawGetRandomNumberRequest;
import com.megvii.faceid.model.raw.video.number.RawGetRandomNumberResponse;
import com.megvii.faceid.model.raw.video.number.RawValidateVideoRequest;
import com.megvii.faceid.model.raw.video.number.RawValidateVideoResponse;
import com.megvii.faceid.model.raw.video.still.RawValidateStillRequest;
import com.megvii.faceid.model.raw.video.still.RawValidateStillResponse;
import com.megvii.faceid.model.verify.v2.VerifyV2Request;
import com.megvii.faceid.model.verify.v2.VerifyV2Response;
import com.megvii.faceid.model.verify.v3.GetBizTokenRequest;
import com.megvii.faceid.model.verify.v3.GetBizTokenResponse;
import com.megvii.faceid.model.verify.v3.VerifyV3Request;
import com.megvii.faceid.model.verify.v3.VerifyV3Response;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.JsonUtils;

import java.util.UUID;

public class Program
{
    private static final String API_KEY = "";
    private static final String API_SECRET = "";
    private static final String IDCARD_NAME = "";
    private static final String IDCARD_NUMBER = "";

    private static FaceIdClient faceIdClient;

    public static void main(String[] args) throws Exception
    {
        // 配置 FaceIDConfig
        FaceIdConfig faceIdConfig = new FaceIdConfig(API_KEY, API_SECRET);
        // 配置 HttpConfig
        HttpConfig httpConfig = new HttpConfig.Builder()
                .setWriteTimeout(15000) /* 设置写超时 */
                .setReadTimeout(15000) /* 设置读超时 */
                .setConnectTimeout(15000) /* 设置连接超时 */
                .setRetryOnConnectionFailure(true) /* 设置失败是否重试 */
                .build();
        // 初始化配置 FaceIdClient
        faceIdClient = new FaceIdClient(faceIdConfig, httpConfig);
        faceIdClient.setHost(FaceIdHost.China);
    }

    public static void callDetect() throws Exception
    {
        DetectRequest request = new DetectRequest();
        request.setImage(CommonUtils.getResourceBytes("face.jpg"));
        request.setMultiOrientedDetection("1");
        DetectResponse response = faceIdClient.Detect(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callIdCardV1Front() throws Exception
    {
        IdCardV1Request request = new IdCardV1Request();
        request.setImage(CommonUtils.getResourceBytes("idcard_front.jpg"));
        request.setLegality("1");
        IdCardV1Response response = faceIdClient.OcrIdCardV1(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callIdCardV1Back() throws Exception
    {
        IdCardV1Request request = new IdCardV1Request();
        request.setImage(CommonUtils.getResourceBytes("idcard_back.jpg"));
        request.setLegality("1");
        IdCardV1Response response = faceIdClient.OcrIdCardV1(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callIdCardV2Front() throws Exception
    {
        IdCardV2Request request = new IdCardV2Request();
        request.setImage(CommonUtils.getResourceBytes("idcard_front.jpg"));
        request.setReturnPortrait("0");
        IdCardV2Response response = faceIdClient.OcrIdCardV2(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callIdCardV2Back() throws Exception
    {
        IdCardV2Request request = new IdCardV2Request();
        request.setImage(CommonUtils.getResourceBytes("idcard_back.jpg"));
        request.setReturnPortrait("0");
        IdCardV2Response response = faceIdClient.OcrIdCardV2(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callBankCard() throws Exception
    {
        BankCardRequest request = new BankCardRequest();
        request.setImage(CommonUtils.getResourceBytes("bankcard2.jpg"));
        BankCardResponse response = faceIdClient.OcrBankCard(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callAppGetBizToken() throws Exception
    {
        GetBizTokenRequest request = new GetBizTokenRequest();
        request.setLivenessType("still");
        request.setComparisonType("0");
        request.setIdcardName(IDCARD_NAME);
        request.setIdcardNumber(IDCARD_NUMBER);
        request.setUuid(UUID.randomUUID().toString());
        request.setImageRef1(CommonUtils.getResourceBytes("face.jpg"));
        request.setImageRef2(CommonUtils.getResourceBytes("face.jpg"));
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setLivenessTimeout(String.valueOf(5));
        request.setLivenessActionCount(String.valueOf(2));
        request.setFaceReplaceDetection(String.valueOf(1));
        request.setEyesCloseDetection(String.valueOf(1));
        request.setFlashLivenessTimeout(String.valueOf(60));
        request.setImage(CommonUtils.getResourceBytes("face.jpg"));
        request.setFailWhenMultipleFaces(String.valueOf(0));
        request.setFaceQualityThreshold(String.valueOf(35));
        request.setReturnFaces(String.valueOf(1));
        request.setVerbose(String.valueOf(1));
        request.setSecurityLevel(String.valueOf(2));
        request.setForceCompare(String.valueOf(1));
        request.setMultiOrientedDetection(String.valueOf(1));
        request.setLivenessLevel(String.valueOf(0));
        request.setMaximumBrightness(String.valueOf(1));
        GetBizTokenResponse response = faceIdClient.AppGetBizToken(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callAppVerifyV3() throws Exception
    {
        VerifyV3Request request = new VerifyV3Request();
        request.setBizToken("1608692746,7b35d0db-6b2e-4e36-8449-857f5b3e892b");
        request.setMegliveData(CommonUtils.getResourceBytes("meglive_data"));
        VerifyV3Response response = faceIdClient.AppVerifyV3(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callAppVerifyV2() throws Exception
    {
        VerifyV2Request request = new VerifyV2Request();
        request.setComparisonType("1");
        request.setFaceImageType("meglive");
        request.setIdcardName(IDCARD_NAME);
        request.setIdcardNumber(IDCARD_NUMBER);
        request.setUuid(UUID.randomUUID().toString());
        request.setImageRef1(CommonUtils.getResourceBytes("face.jpg"));
        request.setImageRef2(CommonUtils.getResourceBytes("idcard_front.jpg"));
        request.setDelta(new String(CommonUtils.getResourceBytes("delta.txt")));
        request.setImageBest(CommonUtils.getResourceBytes("image_best.jpg"));
        request.setImageEnv(CommonUtils.getResourceBytes("image_env.jpg"));
        request.setMultiOrientedDetection("1");
        VerifyV2Response response = faceIdClient.AppVerifyV2(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callPcGetToken() throws Exception
    {
        PcGetTokenRequest request = new PcGetTokenRequest();
        request.setComparisonType("1");
        request.setIdcardName(IDCARD_NAME);
        request.setIdcardNumber(IDCARD_NUMBER);
        request.setUuid(UUID.randomUUID().toString());
        request.setImageRef1(CommonUtils.getResourceBytes("face.jpg"));
        request.setImageRef2(CommonUtils.getResourceBytes("idcard_front.jpg"));
        request.setReturnUrl("https://www.baidu.com");
        request.setNotifyUrl("https://www.baidu.com");
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setBizExtraData("{\"test\": \"dataString\"}");
        request.setSceneId("test2");
        request.setScreenReplay("1");
        PcGetTokenResponse response = faceIdClient.PcGetToken(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callPcGetResult() throws Exception
    {
        PcGetResultRequest request = new PcGetResultRequest();
        request.setBizId("1608890754,26cc0121-9320-4919-9c92-a647bbd41d80");
        request.setGetImageType(2);
        PcGetResultResponse response = faceIdClient.PcGetResult(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callLiteGetToken() throws Exception
    {
        LiteGetTokenRequest request = new LiteGetTokenRequest();
        request.setComparisonType("1");
        request.setIdcardMode("0");
        request.setIdcardName(IDCARD_NAME);
        request.setIdcardNumber(IDCARD_NUMBER);
        request.setUuid(UUID.randomUUID().toString());
        request.setProcedureType("still");
        request.setImageRef1(CommonUtils.getResourceBytes("face.jpg"));
        request.setImageRef2(CommonUtils.getResourceBytes("idcard_front.jpg"));
        request.setReturnUrl("https://www.baidu.com");
        request.setNotifyUrl("https://www.baidu.com");
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setBizExtraData("{\"test\": \"dataString\"}");
        request.setSceneId("test2");
        LiteGetTokenResponse response = faceIdClient.LiteGetToken(request);
        System.out.println(JsonUtils.toJson(response));
    }

    public static void callLiteGetResult() throws Exception
    {
        LiteGetResultRequest request = new LiteGetResultRequest();
        request.setBizId("1609321866,84e30f13-f7a4-4c5f-b53d-2cb3307838aa");
        request.setReturnImage("4");
        LiteGetResultResponse response = faceIdClient.LiteGetResult(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }

    public static void callRawGetRandomNumber() throws Exception
    {
        RawGetRandomNumberRequest request = new RawGetRandomNumberRequest();
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        RawGetRandomNumberResponse response = faceIdClient.RawGetRandomNumber(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }

    public static void callRawValidateVideo() throws Exception
    {
        RawValidateVideoRequest request = new RawValidateVideoRequest();
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setReturnImage("1");
        request.setTokenRandomNumber("9d6c5c28d6d681dd2271e6f07c11a7b9");
        request.setVideo(CommonUtils.getResourceBytes("video.mp4"));
        RawValidateVideoResponse response = faceIdClient.RawValidateVideo(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }

    public static void callRawValidateFrontFace() throws Exception
    {
        RawValidateFrontFaceRequest request = new RawValidateFrontFaceRequest();
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setSelfie(CommonUtils.getResourceBytes("face_front.jpg"));
        RawValidateFrontFaceResponse response = faceIdClient.RawValidateFrontFace(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }


    public static void callRawValidateSideFace() throws Exception
    {
        RawValidateSideFaceRequest request = new RawValidateSideFaceRequest();
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setSelfie(CommonUtils.getResourceBytes("face_side.jpg"));
        request.setTokenFrontFace("74cc13ad0e104ecc728d8f1919d7e67f");
        RawValidateSideFaceResponse response = faceIdClient.RawValidateSideFace(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }

    public static void callRawValidateStill() throws Exception
    {
        RawValidateStillRequest request = new RawValidateStillRequest();
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setReturnImage("1");
        request.setVideo(CommonUtils.getResourceBytes("video.mp4"));
        RawValidateStillResponse response = faceIdClient.RawValidateStill(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }

    public static void callRawVerify() throws Exception
    {
        RawVerifyRequest request = new RawVerifyRequest();
        request.setBizNo(String.valueOf(System.currentTimeMillis()));
        request.setToken("fcd604fbaa7655d0dcfbee65ec501bdf");
        request.setComparisonType("1");
        request.setIdcardName(IDCARD_NAME);
        request.setIdcardNumber(IDCARD_NUMBER);
        request.setUuid(UUID.randomUUID().toString());
        request.setImageRef1(CommonUtils.getResourceBytes("face.jpg"));
        request.setImageRef2(CommonUtils.getResourceBytes("idcard_front.jpg"));
        request.setLivenessPreferences("none");
        request.setMultiOrientedDetection("1");
        RawVerifyResponse response = faceIdClient.RawVerify(request);
        String json = JsonUtils.toJson(response);
        System.out.println(json);
    }
}
