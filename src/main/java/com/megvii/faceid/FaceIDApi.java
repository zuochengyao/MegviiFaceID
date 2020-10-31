package com.megvii.faceid;

import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpConnection;

public class FaceIDApi
{
    private FaceID mFaceID;
    private HttpConfig mHttpConfig;
    private HttpConnection mConnection;

    public FaceIDApi(FaceID faceid)
    {
        this(faceid, new HttpConfig.Builder().build());
    }

    public FaceIDApi(FaceID faceid, HttpConfig httpConfig)
    {
        this.mFaceID = faceid;
        this.mHttpConfig = httpConfig;
        HttpConnection.Builder builder = new HttpConnection.Builder()
                .setConnectTimeout(httpConfig.getConnectTimeout())
                .setProxy(null)
                .addInterceptors(null);
    }
}
