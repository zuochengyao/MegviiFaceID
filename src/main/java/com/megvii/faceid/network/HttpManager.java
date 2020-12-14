package com.megvii.faceid.network;

import com.megvii.faceid.network.framework.HttpConnectionFactory;
import com.megvii.faceid.network.framework.IHttpConnection;

import java.io.IOException;

public class HttpManager
{
    private final IHttpConnection mHttpConnection;

    public HttpManager(HttpConfig config)
    {
        this.mHttpConnection = HttpConnectionFactory.getInstance().newHttpConnection(config);
    }

    public HttpResponse execute(HttpRequest request) throws IOException
    {
        return mHttpConnection.execute(request);
    }

    public void enqueue(HttpRequest request) throws IOException
    {
        mHttpConnection.enqueue(request);
    }
}
