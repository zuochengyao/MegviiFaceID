package com.megvii.faceid.model.base;

import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.HttpMethod;

import java.util.HashMap;

public abstract class BaseRequest// implements IRequest
{
    protected HttpHeader mHeader = new HttpHeader();

    protected HashMap<String, Object> mParams = new HashMap<>();

    protected <T> void addStringParam(String key, T value)
    {
        if (value != null)
            this.mParams.put(key, String.valueOf(value));
    }

    protected void addBinaryParam(String key, byte[] file)
    {
        if (file != null && file.length > 0)
            this.mParams.put(key, file);
    }

    public HashMap<String, Object> getParams()
    {
        return mParams;
    }

    public HttpHeader headers()
    {
        return this.mHeader;
    }

    public void addHeader(String key, String value)
    {
        this.mHeader.put(key, value);
    }

    public abstract void toMap();

    public abstract String getUrl();

    public abstract HttpMethod method();
}
