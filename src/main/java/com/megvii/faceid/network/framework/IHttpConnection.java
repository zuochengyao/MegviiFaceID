package com.megvii.faceid.network.framework;

import com.megvii.faceid.network.HttpConfig;
import com.megvii.faceid.network.HttpRequest;
import com.megvii.faceid.network.HttpResponse;

import java.io.IOException;

public abstract class IHttpConnection
{
    protected HttpConfig mHttpConfig;

    public IHttpConnection(HttpConfig config)
    {
        this.mHttpConfig = config;
    }

    public abstract HttpResponse execute(HttpRequest request) throws IOException;

    public abstract void enqueue(HttpRequest request) throws IOException;
}
