package com.megvii.faceid.network.http.framework.origin;

import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpRequest;
import com.megvii.faceid.network.http.HttpResponse;
import com.megvii.faceid.network.http.framework.IHttpConnection;

import java.io.IOException;

public class OriginHttpConnection extends IHttpConnection
{
    public OriginHttpConnection(HttpConfig config)
    {
        super(config);
    }

    @Override
    public HttpResponse execute(HttpRequest request) throws IOException
    {
        return null;
    }

    @Override
    public void enqueue(HttpRequest request) throws IOException
    {

    }
}
