package com.megvii.faceid.network.http.framework;

import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpRequest;
import com.megvii.faceid.network.http.HttpResponse;

import java.io.IOException;

public abstract class IHttpConnection
{
    HttpConfig mHttpConfig;

    public IHttpConnection(HttpConfig config)
    {
        this.mHttpConfig = config;
    }

    public abstract HttpResponse execute(HttpRequest request) throws IOException;
    public abstract void enqueue(HttpRequest request) throws IOException;
}
