package com.megvii.faceid;

import com.megvii.faceid.exception.ApiKeyNullException;
import com.megvii.faceid.exception.ApiSecretNullException;
import com.megvii.faceid.util.FaceIDUtils;

public class FaceIDConfig
{
    private String apiKey;
    private String apiSecret;
    private String apiSign;

    public FaceIDConfig(String apiKey, String apiSecret)
    {
        this(apiKey, apiSecret, "");
    }

    public FaceIDConfig(String apiKey, String apiSecret, String apiSign)
    {
        if (FaceIDUtils.isNullOrEmpty(apiKey))
            throw new ApiKeyNullException();
        if (FaceIDUtils.isNullOrEmpty(apiSecret))
            throw new ApiSecretNullException();
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        if (FaceIDUtils.isNullOrEmpty(apiSign))
        {
            this.apiSign = FaceIDUtils.genSign(apiKey, apiSecret, 3600);
        }
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
    }

    public String getApiSecret()
    {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret)
    {
        this.apiSecret = apiSecret;
    }

    public String getApiSign()
    {
        return apiSign;
    }

    public void setApiSign(String apiSign)
    {
        this.apiSign = apiSign;
    }
}
