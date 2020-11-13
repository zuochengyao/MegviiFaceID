package com.megvii.faceid.model.base;

import java.util.HashMap;

public abstract class BaseRequestModel extends BaseModel
{
    protected HashMap<String, Object> mParams = new HashMap<>();
    protected abstract void toMap();

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
}
