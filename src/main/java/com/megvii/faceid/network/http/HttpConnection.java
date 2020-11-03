package com.megvii.faceid.network.http;

import okhttp3.Request;

public class HttpConnection
{
    private HttpConfig httpConfig;

    public HttpConnection()
    {
        this(HttpConfig.getDefault());
    }

    public HttpConnection(HttpConfig config)
    {
        this.httpConfig = config;
    }

    public HttpResponse execute(Request request)
    {
        return null;
    }

    public HttpResponse post(Request request)
    {
        return null;
    }

    public HttpResponse get(String url)
    {
        Request request = new Request.Builder().url(url).get().build();
        return execute(request);
    }
}
