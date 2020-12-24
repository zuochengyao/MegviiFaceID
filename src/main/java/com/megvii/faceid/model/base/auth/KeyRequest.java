package com.megvii.faceid.model.base.auth;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseRequest;
import com.megvii.faceid.util.Const;

public abstract class KeyRequest extends BaseRequest
{
    @SerializedName("api_key")
    private String apiKey;
    @SerializedName("api_secret")
    private String apiSecret;

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

    @Override
    public void toMap()
    {
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }
}
