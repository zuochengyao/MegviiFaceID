## FaceID ![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg) ![License](https://img.shields.io/badge/Version-1.0.0--beta-green)

<p align="center"><img src="logo_megvii_faceid.png" alt="faceid" width="300"/></p>

> 一个用于快速接入旷视 FaceID 平台的接口封装库，为用户节省集成的时间成本，更注重本部业务本身。<br/>
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
>请务必将上述依赖库添加到您的工程中，否则会调用异常

#### 库引用安装（推荐）
将 `jars/build/megvii-faceid-1.0.0-beta.jar` 放在您的项目中即可。

#### 源码安装
1. 将当前库的源码包下载到本地
2. 解压源码到您项目的合适目录下

### 调用示例

```Java
class FaceIDManager
{
    private static final String API_KEY = "your api key";
    private static final String API_SECRET = "your api secret";
    
    private FaceIdClient faceIdClient;
    
    /** 
     * 初始化配置
     */
    public void init()
    {
        // 配置 FaceIDConfig
        FaceIdConfig faceIdConfig = new FaceIdConfig(API_KEY, API_SECRET);
        // 配置 HttpConfig
        HttpConfig httpConfig = new HttpConfig.Builder().setWriteTimeout(15000) /* 设置写超时 */
                                                        .setReadTimeout(15000) /* 设置读超时 */
                                                        .setConnectTimeout(15000) /* 设置连接超时 */
                                                        .setRetryOnConnectionFailure(true) /* 设置失败是否重试 */
                                                        .build();
        // 初始化配置 FaceIdClient                                                       
        faceIdClient = new FaceIdClient(faceIdConfig, httpConfig);
        faceIdClient.setHost(FaceIdHost.China);
    }

    /**
     * 发起请求（以身份证 Detect 接口为例）
     * @throws Exception
     */
    public void callDetect() throws Exception
    {
        DetectRequest request = new DetectRequest();
        request.setImage(CommonUtils.getResourceBytes("face.jpg"));
        request.setMultiOrientedDetection("1");
        DetectResponse response = faceIdClient.Detect(request);
        System.out.println(JsonUtils.toJson(response));
    }
}
```

### 类说明

#### FaceIdHost
``` java
/**
 * 枚举类，配置 FaceID 服务 host 地址
 */
enum FaceIdHost 
{
    // 国内服务
    China(Const.API_HOST_URL_CHINA),
    // 印尼服务
    Indonesia(Const.API_HOST_URL_IDN),
    // 新加坡服务
    Singapore(Const.API_HOST_URL_SGP);
}
```

#### FaceIdConfig
``` java
// 配置 FaceID 平台 api_key 与 api_secret

// 构造器
public FaceIdConfig(String key, String secret);
```

