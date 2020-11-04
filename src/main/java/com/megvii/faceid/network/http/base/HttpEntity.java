package com.megvii.faceid.network.http.base;

import java.util.HashMap;
import java.util.Random;

public abstract class HttpEntity
{
    private final static char[] MULTIPART_CHARS = "-1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    protected String mBoundary;
    protected HashMap<String, Object> mParamMap;

    protected HttpEntity()
    {
        this.mParamMap = new HashMap<>();
        this.mBoundary = genBoundary();
    }

    private String genBoundary()
    {
        StringBuilder builder = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 36; i++)
            builder.append(MULTIPART_CHARS[rand.nextInt(MULTIPART_CHARS.length)]);
        return builder.toString();
    }

    public String getBoundary()
    {
        return mBoundary;
    }

    public void addString(String key, String value)
    {

    }
}
