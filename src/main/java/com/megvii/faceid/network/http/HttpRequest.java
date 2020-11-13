package com.megvii.faceid.network.http;

import com.megvii.faceid.model.base.BaseRequestModel;
import com.megvii.faceid.network.http.base.HttpHeader;
import com.megvii.faceid.network.http.base.HttpMethod;

import java.io.Closeable;
import java.io.IOException;

public final class HttpRequest implements Closeable
{
    private final String url;
    private HttpMethod httpMethod;
    private HttpHeader httpHeader = new HttpHeader();
    private BaseRequestModel data;

    public HttpRequest(String url, BaseRequestModel data)
    {
        this.url = url;
        this.data = data;
    }

    public String getUrl()
    {
        return url;
    }

    public HttpMethod getHttpMethod()
    {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod)
    {
        this.httpMethod = httpMethod;
    }

    public HttpHeader getHttpHeader()
    {
        return httpHeader;
    }

    public void setHttpHeader(HttpHeader httpHeader)
    {
        this.httpHeader = httpHeader;
    }

    public BaseRequestModel getData()
    {
        return data;
    }

    public void setData(BaseRequestModel data)
    {
        this.data = data;
    }

    @Override
    public void close() throws IOException
    {

    }
}
