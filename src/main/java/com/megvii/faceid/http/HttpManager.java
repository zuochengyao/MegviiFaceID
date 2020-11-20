package com.megvii.faceid.http;

import com.megvii.faceid.http.framework.HttpConnectionFactory;
import com.megvii.faceid.http.framework.IHttpConnection;

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
        mHttpConnection.execute(request);
        return null;
    }
}
