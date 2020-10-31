package com.megvii.faceid.network.http.framework.ok;

import okhttp3.OkHttpClient;

public class OkHttpManager
{
    private static volatile OkHttpManager mInstance;
    private OkHttpClient client;
    private OkHttpClient.Builder clientBuilder;

    private OkHttpManager()
    {
    }

    public static OkHttpManager getInstance()
    {
        if (mInstance == null)
        {
            synchronized (OkHttpManager.class)
            {
                if (mInstance == null)
                    mInstance = new OkHttpManager();
            }
        }
        return mInstance;
    }

    public OkHttpClient getClient()
    {
        return client;
    }
}
