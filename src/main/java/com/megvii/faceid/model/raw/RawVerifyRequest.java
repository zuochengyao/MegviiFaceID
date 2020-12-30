package com.megvii.faceid.model.raw;

import com.megvii.faceid.model.base.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.CompareRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

public class RawVerifyRequest extends CompareRequest implements IKeyRequest
{
    private String token;
    private String bizNo;
    private String livenessPreferences;

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
        this.addStringParam(Const.API_PARAM_TOKEN, token);
    }

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
    }

    public String getLivenessPreferences()
    {
        return livenessPreferences;
    }

    public void setLivenessPreferences(String livenessPreferences)
    {
        this.livenessPreferences = livenessPreferences;
        this.addStringParam(Const.API_PARAM_LIVENESS_PREFERENCES, livenessPreferences);
    }

    @Override
    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
    }

    @Override
    public void setApiSecret(String apiSecret)
    {
        this.apiSecret = apiSecret;
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/verify";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
