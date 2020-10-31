package com.megvii.faceid;

import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpConnection;

public class FaceIDApi
{
    private FaceIDConfig mFaceIDConfig;
    private HttpConfig mHttpConfig;
    private HttpConnection mConnection;

    public FaceIDApi(FaceIDConfig faceidConfig)
    {
        this(faceidConfig, new HttpConfig.Builder().build());
    }

    public FaceIDApi(FaceIDConfig faceidConfig, HttpConfig httpConfig)
    {
        this.mFaceIDConfig = faceidConfig;
        this.mHttpConfig = httpConfig;
        HttpConnection.Builder builder = new HttpConnection.Builder();
        builder.setConnectTimeout(httpConfig.getConnectTimeout());
    }


}
