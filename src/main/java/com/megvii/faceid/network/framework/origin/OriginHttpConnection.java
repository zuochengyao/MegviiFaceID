package com.megvii.faceid.network.framework.origin;

import com.megvii.faceid.network.HttpConfig;
import com.megvii.faceid.network.HttpRequest;
import com.megvii.faceid.network.HttpResponse;
import com.megvii.faceid.network.framework.IHttpConnection;

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
