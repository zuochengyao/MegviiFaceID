package com.megvii.faceid.network.http.framework.ok;

import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.framework.IHttpConnection;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class OkHttpConnection extends IHttpConnection
{
    private OkHttpClient mOkHttpClient;

    public OkHttpConnection(HttpConfig config)
    {
        super(config);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(config.getConnectTimeout(), TimeUnit.MILLISECONDS)
               .readTimeout(config.getReadTimeout(), TimeUnit.MILLISECONDS)
               .writeTimeout(config.getWriteTimeout(), TimeUnit.MILLISECONDS)/*.proxy(config.getProxy())*/;
        mOkHttpClient = builder.build();
    }


}
