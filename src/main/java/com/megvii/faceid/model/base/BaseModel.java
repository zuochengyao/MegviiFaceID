package com.megvii.faceid.model.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class BaseModel
{
    public <O extends BaseModel> String toJsonObject(O model)
    {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return null;
    }
}
