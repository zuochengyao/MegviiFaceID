# FaceID ![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg) ![License](https://img.shields.io/badge/Version-1.0.0--beta-green)

<p align="center"><img src="logo_megvii_faceid.png" alt="faceid" width="300"/></p>

> 一个用于快速接入旷视 FaceID 平台的 Java 服务端接口封装库，为用户节省集成的时间成本，更注重业务本身。<br/>
> 注意：此接口库为 FaceID <b>`商务平台`</b> 的接口文档，使用 <b>`自助平台`</b> 的用户，请勿集成。

### 使用环境

```
1. JDK8 及以上版本
2. 在旷视 FaceID 商务平台获取 api_key 和 api_secret
```

### 依赖库

依赖库|okio|okhttp3|gson|kotlin-stdlib
---|---|---|---|---
版本号|[![Download](https://img.shields.io/badge/Version-2.9.0-blue)](https://mvnrepository.com/artifact/com.squareup.okio/okio/2.9.0)|[![Download](https://img.shields.io/badge/Version-3.14.9-blue)](https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp/3.14.9)|[![Download](https://img.shields.io/badge/Version-2.8.6-blue)](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6)|[![Download](https://img.shields.io/badge/Version-1.4.10-blue)](https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib/1.4.10)

以上为`MegviiFaceID`工程所依赖的库，所有的`jar`包文件都已放在工程根目录的`jars/dependency`下，可直接添加到您的项目中引用。

### 安装方式（二选一）

> 请务必将上述依赖库添加到您的工程中，否则会调用异常

#### 库引用安装（推荐）

将 `jars/build/megvii-faceid-1.0.0-beta.jar` 放在您的项目中即可。

#### 源码安装

1. 将当前库的源码包下载到本地
2. 解压源码到您项目的合适目录下

### 调用示例

```Java
public class Program
{
    private static final String API_KEY = "your api key";
    private static final String API_SECRET = "your api secret";

    public static void main(String[] args)
    {
        try
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
            
            // 调用接口，以 Detect 接口为例
            DetectRequest request = new DetectRequest();
            request.setImage(CommonUtils.getResourceBytes("face.jpg"));
            request.setMultiOrientedDetection("1");
            DetectResponse response = faceIdClient.Detect(request);
            System.out.println(JsonUtils.toJson(response));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
```

### 类接口说明

#### FaceIdHost
枚举类，配置 FaceID 服务 host 地址
``` java
// 国内服务地址
China(Const.API_HOST_URL_CHINA),
// 印尼服务地址
Indonesia(Const.API_HOST_URL_IDN),
// 新加坡服务地址
Singapore(Const.API_HOST_URL_SGP);
```

#### FaceIdConfig
用于配置 FaceID 平台 api_key、api_secret 与 api_sign 过期时间

##### 构造器
``` java
/**
 * 提供了两个构造器，apiSignTimeout 默认为 3600 秒
 */
public FaceIdConfig(String key, String secret);
public FaceIdConfig(String key, String secret, int apiSignTimeout);
```

#### HttpConfig
Http 请求配置类，用于设置网络请求的超时时间等

##### 实例化
``` java
// 1. 通过获取默认对象
HttpConfig.getDefault();

// 2. 通过 Builder 模式获取对象
HttpConfig.Builder builder = new HttpConfig.Builder();
builder.setWriteTimeout(TIMEOUT);
builder.setReadTimeout(TIMEOUT);
builder.setConnectTimeout(TIMEOUT);
builder.setRetryOnConnectionFailure(IS_RETRY);
builder.build();
```

#### FaceIdClient
FaceID 平台接口调用类

##### 构造器
``` java
public FaceIdClient(FaceIdConfig faceidConfig);
public FaceIdClient(FaceIdConfig faceidConfig, HttpConfig httpConfig);
```

##### 内部方法
``` java
// 设置 Host 服务地址
public void setHost(FaceIdHost host);

/**
 * 人脸检测 Detect
 * 接口参数文档：https://faceid.com/pages/documents/4173042
 */
public DetectResponse Detect(DetectRequest req) throws IOException;

/**
 * 身份证 OCR V1.0.0 不推荐
 * 接口参数文档：http://bj-faceid-prod-asset.oss-cn-beijing.aliyuncs.com/WIKI_SYNC_PICS/DOCS/OCRIDCard_v1.0.0.pdf
 */
public IdCardV1Response OcrIdCardV1(IdCardV1Request req) throws IOException;

/**
 * 身份证 OCR V2.0.0 推荐
 * 接口参数文档：https://faceid.com/pages/documents/10881005
 */
public IdCardV2Response OcrIdCardV2(IdCardV2Request req) throws IOException;

/**
 * 银行卡 OCR
 * 接口参数文档：https://faceid.com/pages/documents/10881161
 */
public BankCardResponse OcrBankCard(BankCardRequest req) throws IOException;

/**
 * SDK - 获取 biz_token
 * 接口参数文档：https://faceid.com/pages/documents/37661898
 */
public GetBizTokenResponse AppGetBizToken(GetBizTokenRequest req) throws IOException;

/**
 * Verify V3.0.0
 * 接口参数文档：https://faceid.com/pages/documents/37662519
 */
public VerifyV3Response AppVerifyV3(VerifyV3Request req) throws IOException;

/**
 * Verify V2.0.6
 * 接口参数文档：https://faceid.com/pages/documents/4173286
 */
public VerifyV2Response AppVerifyV2(VerifyV2Request req) throws IOException;

/**
 * PC 网页 KYC 验证服务 - 获取 token
 * 接口参数文档：https://faceid.com/pages/documents/5680502
 */
public PcGetTokenResponse PcGetToken(PcGetTokenRequest req) throws IOException;

/**
 * PC 网页 KYC 验证服务 - 获取验证结果
 * 接口参数文档：https://faceid.com/pages/documents/5680508
 */
public PcGetResultResponse PcGetResult(PcGetResultRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Lite - 获取 token
 * 接口参数文档：https://faceid.com/pages/documents/5680475
 */
public LiteGetTokenResponse LiteGetToken(LiteGetTokenRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Lite - 获取验证结果
 * 接口参数文档：https://faceid.com/pages/documents/5680488
 */
public LiteGetResultResponse LiteGetResult(LiteGetResultRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Raw - 获取 token
 * 接口参数文档：https://faceid.com/pages/documents/7775613
 */
public RawGetRandomNumberResponse RawGetRandomNumber(RawGetRandomNumberRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Raw - 上传读数视频
 * 接口参数文档：https://faceid.com/pages/documents/7775631
 */
public RawValidateVideoResponse RawValidateVideo(RawValidateVideoRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Raw - 上传用户自拍正脸照片
 * 接口参数文档：https://faceid.com/pages/documents/7775665
 */
public RawValidateFrontFaceResponse RawValidateFrontFace(RawValidateFrontFaceRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Raw - 验证用户的侧脸照片
 * 接口参数文档：https://faceid.com/pages/documents/7775684
 */
public RawValidateSideFaceResponse RawValidateSideFace(RawValidateSideFaceRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Raw - 上传静默视频
 * 接口参数文档：https://faceid.com/pages/documents/218677281
 */
public RawValidateStillResponse RawValidateStill(RawValidateStillRequest req) throws IOException;

/**
 * 移动端网页 KYC 验证服务 Raw - Verify 验证
 * 接口参数文档：https://faceid.com/pages/documents/7775652
 */
public RawVerifyResponse RawVerify(RawVerifyRequest req) throws IOException;
```

### 详细示例
在`samples/Program.java`文件中，可以查看更多接口调用示例。其中接口参数为测试值，在正式使用时，请传递真是参数。