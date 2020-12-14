package com.megvii.faceid.model.base.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.base.IRequest;

import java.util.HashMap;

public abstract class BaseRequest implements IRequest
{
    protected HttpHeader mHeader = new HttpHeader();

    protected HashMap<String, Object> mParams = new HashMap<>();

    protected  <T> void addStringParam(String key, T value)
    {
        if (value != null)
            this.mParams.put(key, String.valueOf(value));
    }

    protected void addBinaryParam(String key, byte[] file)
    {
        if (file != null && file.length > 0)
            this.mParams.put(key, file);
    }

    public <O> String toJsonObject(O model)
    {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return null;
    }

    public HashMap<String, Object> getParams()
    {
        return mParams;
    }

    @Override
    public HttpHeader headers()
    {
        return this.mHeader;
    }

    @Override
    public void addHeader(String key, String value)
    {
        this.mHeader.put(key, value);
    }

    protected abstract void toMap();
}
