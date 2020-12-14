package com.megvii.faceid.network;

import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.network.http.base.IRequest;

import java.io.Closeable;
import java.io.IOException;

public final class HttpRequest implements IRequest, Closeable
{
    private final String url;
    private HttpHeader httpHeader = new HttpHeader();
    private BaseRequest data;

    public HttpRequest(String url, BaseRequest data)
    {
        this.url = url;
        this.data = data;
    }

    @Override
    public String getUrl()
    {
        return url;
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }

    @Override
    public HttpHeader headers()
    {
        return null;
    }

    @Override
    public void addHeader(String key, String value)
    {

    }

    public HttpHeader getHttpHeader()
    {
        return httpHeader;
    }

    public void setHttpHeader(HttpHeader httpHeader)
    {
        this.httpHeader = httpHeader;
    }

    public BaseRequest getData()
    {
        return data;
    }

    @Override
    public void close() throws IOException
    {

    }
}
