## FaceID ![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg) ![License](https://img.shields.io/badge/Version-1.0.0--beta-green)

<p align="center"><img src="logo_megvii_faceid.png" alt="faceid" width="300"/></p>

> 一个用于快速接入旷视 FaceID 平台的接口封装库，为用户节省集成的时间成本，更注重本部业务本身。<br/>
> 注意：此接口库为 FaceID <b>`商务平台`</b> 的接口文档，使用 <b>`自助平台`</b> 的用户，请勿集成。

#### 一. 使用环境

```
1. JDK8 及以上版本
2. 在旷视 FaceID 商务平台获取 api_key 和 api_secret
```

#### 二. 依赖库

依赖库|okio|okhttp3|gson|kotlin-stdlib
---|---|---|---|---
版本号|[![Download](https://img.shields.io/badge/Version-2.9.0-blue)](https://mvnrepository.com/artifact/com.squareup.okio/okio/2.9.0)|[![Download](https://img.shields.io/badge/Version-3.14.9-blue)](https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp/3.14.9)|[![Download](https://img.shields.io/badge/Version-2.8.6-blue)](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6)|[![Download](https://img.shields.io/badge/Version-1.4.10-blue)](https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib/1.4.10)

以上为`MegviiFaceID`工程所依赖的库，所有的`jar`包文件都已放在工程根目录的`jar/dependency`下，可直接放到您的项目中引用。

#### 三. 安装方式（二选一）
>请务必将上述依赖库添加到您的工程中，否则会调用异常

##### 1. 库引用安装（推荐）
将 `jars/build/megvii-faceid-1.0.0-beta.jar` 放在您的项目中即可。

##### 2. 源码安装
1. 将当前库的源码包下载到本地
2. 解压源码到项目的合适目录下


