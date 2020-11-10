package com.megvii.faceid.model.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

abstract class BaseModel
{
    private HashMap<String, Object> mParams = new HashMap<>();

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

    public <O extends BaseModel> String toJsonObject(O model)
    {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return null;
    }
}
