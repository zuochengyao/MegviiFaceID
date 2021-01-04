package com.megvii.faceid.http;

import com.megvii.faceid.http.base.HttpHeader;
import com.megvii.faceid.http.base.HttpMethod;

import java.util.Map;

public class HttpRequest
{
    private String url;
    private HttpMethod httpMethod;
    private Map<String, Object> data;
    private HttpHeader header;

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public HttpMethod method()
    {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod method)
    {
        this.httpMethod = method;
    }

    public Map<String, Object> getData()
    {
        return data;
    }

    public void setData(Map<String, Object> data)
    {
        this.data = data;
    }

    public HttpHeader getHeader()
    {
        return header;
    }

    public void setHeader(HttpHeader header)
    {
        this.header = header;
    }
}
