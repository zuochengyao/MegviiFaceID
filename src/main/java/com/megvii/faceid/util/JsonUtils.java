package com.megvii.faceid.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

public final class JsonUtils
{
    private static final Gson gson;

    static
    {
        gson = builder().setPrettyPrinting().create();
    }

    /**
     * 获取GsonBuilder实例
     */
    public static GsonBuilder builder()
    {
        return new GsonBuilder();
    }

    /**
     * 将对象转为json字符串
     */
    public static String toJson(Object obj)
    {
        String json = null;
        if (gson != null)
        {
            json = gson.toJson(obj);
        }
        return json;
    }

    /**
     * 将json字符串转为指定类型的实例
     */
    public static <T> T parse(String json, Class<T> cls)
    {
        T model = null;
        if (gson != null)
        {
            model = gson.fromJson(json, cls);
        }
        return model;
    }

    /**
     * 将json转为Map
     */
    public static <T> Map<String, T> toMap(String json)
    {
        Map<String, T> map = null;
        if (gson != null)
        {
            map = gson.fromJson(json, new TypeToken<Map<String, T>>()
            { }.getType());
        }
        return map;
    }

    /**
     * 将json转为指定类型的List
     */
    public static <T> List<T> toList(String json, Class<T> cls)
    {
        List<T> list = null;
        if (gson != null)
        {
            // 根据泛型返回解析指定的类型,TypeToken<List<T>>{}.getType()获取返回类型
            list = gson.fromJson(json, new TypeToken<List<T>>()
            { }.getType());
        }
        return list;
    }

    /**
     * 将json转为Map List
     */
    public static <T> List<Map<String, T>> toMapList(String json)
    {
        List<Map<String, T>> list = null;
        if (gson != null)
        {
            list = gson.fromJson(json, new TypeToken<List<Map<String, T>>>()
            { }.getType());
        }
        return list;
    }


}
