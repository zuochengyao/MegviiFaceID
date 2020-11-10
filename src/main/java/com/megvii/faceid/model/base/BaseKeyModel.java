package com.megvii.faceid.model.base;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.common.Const;

public abstract class BaseKeyModel extends BaseModel
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
    protected void toMap()
    {
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }
}
