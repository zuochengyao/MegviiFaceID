package com.megvii.faceid.network.http.framework;

import com.megvii.faceid.network.http.HttpConfig;

public abstract class IHttpConnection
{
    HttpConfig mHttpConfig;
    public IHttpConnection(HttpConfig config)
    {
        this.mHttpConfig = config;
    }
}
