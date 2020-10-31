package com.megvii.faceid.network.http;

public class HttpConfig
{
    /** ���ӳ�ʱʱ�� ��λ���� */
    private final int mConnectTimeout;
    /** �� ��ʱʱ�� ��λ���� */
    private final int mReadTimeout;
    /** д ��ʱʱ�� ��λ���� */
    private final int mWriteTimeout;
    /** �Ƿ��Զ����� */
    private final boolean mRetryOnConnectionFailure;

    private HttpConfig(Builder builder)
    {
        this.mConnectTimeout = builder.connectTimeout;
        this.mReadTimeout = builder.readTimeout;
        this.mWriteTimeout = builder.writeTimeout;
        this.mRetryOnConnectionFailure = builder.retryOnConnectionFailure;
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

    public static class Builder
    {
        private int connectTimeout = 60;
        private int readTimeout = 30;
        private int writeTimeout = 30;
        private boolean retryOnConnectionFailure = true;

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

        public HttpConfig build()
        {
            return new HttpConfig(this);
        }
    }
}
