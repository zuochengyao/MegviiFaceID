package com.megvii.faceid.network.http;

import com.megvii.faceid.network.http.framework.HttpConnectionFactory;
import com.megvii.faceid.network.http.framework.IHttpConnection;

public class HttpManager
{
    private final IHttpConnection mHttpConnection;

    public HttpManager(HttpConfig config)
    {
        this.mHttpConnection = HttpConnectionFactory.getInstance().newHttpConnection(config);
    }

    public IHttpConnection getConnection()
    {
        return mHttpConnection;
    }

    public HttpResponse get()
    {
        return null;
    }

    public HttpResponse postFormData(HttpRequest request)
    {
        return null;
    }

    public HttpResponse postFormUrlEncoded()
    {
        return null;
    }

    public HttpResponse postJson()
    {
        return null;
    }
}
