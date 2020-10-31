package com.megvii.faceid;

import com.megvii.faceid.exception.ApiKeyNullException;
import com.megvii.faceid.exception.ApiSecretNullException;
import com.megvii.faceid.common.Utils;

public class FaceIDConfig
{
    private String megApiKey;
    private String megApiSecret;
    private String megApiSign;
    /** 过期时长（秒）*/
    private int megApiSignTimeout;
    /** 过期时间戳 */
    private long megApiSignExpired;

    public FaceIDConfig(String apiKey, String apiSecret)
    {
        this(apiKey, apiSecret, 3600);
    }

    public FaceIDConfig(String apiKey, String apiSecret, int apiSignTimeout)
    {
        if (Utils.isNullOrEmpty(apiKey))
            throw new ApiKeyNullException();
        if (Utils.isNullOrEmpty(apiSecret))
            throw new ApiSecretNullException();
        this.megApiKey = apiKey;
        this.megApiSecret = apiSecret;
        this.megApiSignTimeout = apiSignTimeout > 0 ? apiSignTimeout : 3600;
    }

    public String getApiKey()
    {
        return megApiKey;
    }

    public String getApiSecret()
    {
        return megApiSecret;
    }

    public String getApiSign()
    {
        long now = System.currentTimeMillis() / 1000;
        if (now >= megApiSignExpired)
        {
            this.megApiSignExpired = now + megApiSignTimeout;
            this.megApiSign = Utils.genSign(megApiKey, megApiSecret, megApiSignExpired);
        }
        return megApiSign;
    }
}
