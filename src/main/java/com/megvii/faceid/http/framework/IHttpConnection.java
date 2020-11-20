package com.megvii.faceid.http.framework;

import com.megvii.faceid.http.HttpConfig;
import com.megvii.faceid.http.HttpRequest;
import com.megvii.faceid.http.HttpResponse;

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
