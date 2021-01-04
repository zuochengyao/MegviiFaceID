package com.megvii.faceid.http;

import java.net.Proxy;

public class HttpConfig
{
    public static final String CLASSNAME_OKHTTP = "okhttp3.OkHttpClient";

    /** 连接超时时长 单位：毫秒 */
    private final int mConnectTimeout;
    /** 读 超时时长 单位：毫秒 */
    private final int mReadTimeout;
    /** 写 超时时长 单位：毫秒 */
    private final int mWriteTimeout;
    /** 是否自动重连 */
    private final boolean mRetryOnConnectionFailure;
    /** 设置代理服务器 */
    private final Proxy mProxy;
    /**
     * http 请求框架
     * 目前支持 okhttp & HttpURLConnection
     * 默认尝试 okhttp，如果反射失败，则选择 HttpURLConnection
     */
    private final String mHttpClassName;

    public static HttpConfig getDefault()
    {
        return new Builder().build();
    }

    private HttpConfig(Builder builder)
    {
        this.mConnectTimeout = builder.connectTimeout;
        this.mReadTimeout = builder.readTimeout;
        this.mWriteTimeout = builder.writeTimeout;
        this.mRetryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.mHttpClassName = builder.httpClassName;
        this.mProxy = builder.proxy;
    }

    public int getConnectTimeout()
    {
        return mConnectTimeout;
    }

    public int getReadTimeout()
    {
        return mReadTimeout;
    }

    public int getWriteTimeout()
    {
        return mWriteTimeout;
    }

    public boolean isRetryOnConnectionFailure()
    {
        return mRetryOnConnectionFailure;
    }

    public String getHttpClassName()
    {
        return mHttpClassName;
    }

    public Proxy getProxy()
    {
        return mProxy;
    }

    public static class Builder
    {
        private int connectTimeout = 10000;
        private int readTimeout = 10000;
        private int writeTimeout = 10000;
        private boolean retryOnConnectionFailure = true;
        private String httpClassName = CLASSNAME_OKHTTP;
        private Proxy proxy;

        public Builder setConnectTimeout(int timeout)
        {
            this.connectTimeout = timeout;
            return this;
        }

        public Builder setReadTimeout(int timeout)
        {
            this.readTimeout = timeout;
            return this;
        }

        public Builder setWriteTimeout(int timeout)
        {
            this.writeTimeout = timeout;
            return this;
        }

        public Builder setRetryOnConnectionFailure(boolean retry)
        {
            this.retryOnConnectionFailure = retry;
            return this;
        }

        public Builder setHttpClassName(String className)
        {
            this.httpClassName = className;
            return this;
        }

        public Builder setProxy(Proxy proxy)
        {
            this.proxy = proxy;
            return this;
        }

        public HttpConfig build()
        {
            return new HttpConfig(this);
        }
    }
}
