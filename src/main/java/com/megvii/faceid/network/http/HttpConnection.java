package com.megvii.faceid.network.http;

import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpConnection
{
    private final OkHttpClient mClient;

    private HttpConnection(Builder connectionBuilder)
    {
        this.mClient = connectionBuilder.okHttpBuilder.build();
    }

    public HttpConnection()
    {
        this(new Builder());
    }

    public Response execute(Request request)
    {
        return null;
    }

    public Response post(Request request)
    {
        return null;
    }

    public Response get(String url)
    {
        Request request = new Request.Builder().url(url).get().build();
        return execute(request);
    }

    public static class Builder
    {
        private final OkHttpClient.Builder okHttpBuilder;

        public Builder()
        {
            this.okHttpBuilder = new OkHttpClient.Builder();
        }

        public Builder setConnectTimeout(int timeout)
        {
            this.okHttpBuilder.connectTimeout(timeout, TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder setReadTimeout(int timeout)
        {
            this.okHttpBuilder.readTimeout(timeout, TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder setWriteTimeout(int timeout)
        {
            this.okHttpBuilder.writeTimeout(timeout, TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder setProxy(Proxy proxy)
        {
            this.okHttpBuilder.proxy(proxy);
            return this;
        }

        public Builder addInterceptors(Interceptor interceptor)
        {
            this.okHttpBuilder.addInterceptor(interceptor);
            return this;
        }

        public HttpConnection build()
        {
            return new HttpConnection(this);
        }
    }
}
