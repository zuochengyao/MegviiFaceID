package com.megvii.faceid.http.framework.ok;

import com.megvii.faceid.http.HttpResponse;
import com.megvii.faceid.http.base.HttpHeader;
import com.megvii.faceid.http.base.HttpStatus;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkHttpResponse extends HttpResponse
{
    private final Response mResponse;
    private HttpHeader mHeaders;

    public OkHttpResponse(Response mResponse)
    {
        this.mResponse = mResponse;
    }

    @Override
    protected InputStream getBodyStream()
    {
        return mResponse.body() != null ? mResponse.body().byteStream() : null;
    }

    @Override
    protected void closeBodyStream()
    {
        ResponseBody body = mResponse.body();
        if (body != null)
            body.close();
    }

    @Override
    public long getContentLength()
    {
        return mResponse.body() != null ? mResponse.body().contentLength() : 0;
    }

    @Override
    public HttpStatus getStatus()
    {
        return HttpStatus.getValue(mResponse.code());
    }

    @Override
    public String getMessage()
    {
        String message;
        try
        {
            message = mResponse.body() != null ? mResponse.body().string() : mResponse.message();
        }
        catch (IOException e)
        {
            message = mResponse.message();
        }
        return message;
    }

    @Override
    public HttpHeader getHeaders()
    {
        if (mHeaders == null)
            mHeaders = new HttpHeader();
        for (String name : mResponse.headers().names())
        {
            mHeaders.put(name, mResponse.headers().get(name));
        }
        return mHeaders;
    }
}
