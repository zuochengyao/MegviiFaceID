package com.megvii.faceid.network;

import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.network.http.base.IRequest;

public final class HttpRequest implements IRequest
{
    private final String url;
    private final BaseRequest data;

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
        return this.data.headers();
    }

    @Override
    public void addHeader(String key, String value)
    {
        this.data.addHeader(key, value);
    }

    public BaseRequest getData()
    {
        return data;
    }
}
