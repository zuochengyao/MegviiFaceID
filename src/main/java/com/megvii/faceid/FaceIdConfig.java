package com.megvii.faceid;

import com.megvii.faceid.common.Utils;
import com.megvii.faceid.exception.ApiKeyNullException;
import com.megvii.faceid.exception.ApiSecretNullException;

public class FaceIdConfig
{
    private static final int TIMEOUT_SIGN = 3600;

    private final String apiKey;
    private final String apiSecret;
    private String apiSign;
    /** 过期时长（秒） */
    private int apiSignTimeout;
    /** 过期时间戳 */
    private long apiSignExpired;

    public FaceIdConfig(String key, String secret)
    {
        this(key, secret, TIMEOUT_SIGN);
    }

    public FaceIdConfig(String key, String secret, int apiSignTimeout)
    {
        if (Utils.isNullOrEmpty(key))
            throw new ApiKeyNullException();
        if (Utils.isNullOrEmpty(secret))
            throw new ApiSecretNullException();
        this.apiKey = key;
        this.apiSecret = secret;
        this.apiSignTimeout = apiSignTimeout > 0 ? apiSignTimeout : TIMEOUT_SIGN;
    }

    public void setApiSignTimeout(int timeout)
    {
        this.apiSignTimeout = timeout;
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public String getApiSecret()
    {
        return apiSecret;
    }

    public String getApiSign()
    {
        long now = System.currentTimeMillis() / 1000;
        if (now >= apiSignExpired)
        {
            this.apiSignExpired = now + apiSignTimeout;
            this.apiSign = Utils.genSign(apiKey, apiSecret, apiSignExpired);
        }
        return apiSign;
    }
}
