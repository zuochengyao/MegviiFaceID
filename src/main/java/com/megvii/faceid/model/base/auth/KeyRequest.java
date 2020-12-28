package com.megvii.faceid.model.base.auth;

import com.megvii.faceid.model.base.BaseRequest;
import com.megvii.faceid.util.Const;

public abstract class KeyRequest extends BaseRequest
{
    protected String apiKey;
    protected String apiSecret;

    public String getApiKey()
    {
        return apiKey;
    }

    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
    }

    public String getApiSecret()
    {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret)
    {
        this.apiSecret = apiSecret;
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }
}
