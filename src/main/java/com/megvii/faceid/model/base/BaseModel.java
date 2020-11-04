package com.megvii.faceid.model.base;

import java.util.HashMap;

abstract class BaseModel
{
    private HashMap<String, Object> mParams = new HashMap<>();

    protected abstract void toMap();
}
