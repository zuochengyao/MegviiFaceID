package com.megvii.faceid.http.framework;

import com.megvii.faceid.http.HttpConfig;
import com.megvii.faceid.http.framework.ok.OkHttpConnection;

/**
 * HttpConnection 工厂类
 *
 * @author Cheero
 * @date 2020/11/3 6:34
 */
public class HttpConnectionFactory
{
    private static volatile HttpConnectionFactory mInstance;

    private HttpConnectionFactory()
    { }

    public static HttpConnectionFactory getInstance()
    {
        if (mInstance == null)
        {
            synchronized (HttpConnectionFactory.class)
            {
                if (mInstance == null)
                    mInstance = new HttpConnectionFactory();
            }
        }
        return mInstance;
    }

    public IHttpConnection newHttpConnection(HttpConfig httpConfig)
    {
        return new OkHttpConnection(httpConfig);
    }
}
