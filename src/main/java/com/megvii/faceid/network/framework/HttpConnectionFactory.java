package com.megvii.faceid.network.framework;

import com.megvii.faceid.common.Utils;
import com.megvii.faceid.network.HttpConfig;
import com.megvii.faceid.network.framework.ok.OkHttpConnection;
import com.megvii.faceid.network.framework.origin.OriginHttpConnection;

/**
 * HttpConnection 工厂类
 *
 * 根据 classname 选择对应框架的请求库
 * 目前支持 okhttp3 & HttpUrlConnection
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
        IHttpConnection httpConnection;
        if (Utils.isClassExist(httpConfig.getHttpClassName()))
        {
            switch (httpConfig.getHttpClassName())
            {
                case HttpConfig.CLASSNAME_OKHTTP:
                    httpConnection = new OkHttpConnection(httpConfig);
                    break;
                default:
                case HttpConfig.CLASSNAME_ORIGIN:
                    httpConnection = new OriginHttpConnection(httpConfig);
                    break;
            }
        }
        else
            httpConnection = new OriginHttpConnection(httpConfig);
        return httpConnection;
    }
}
