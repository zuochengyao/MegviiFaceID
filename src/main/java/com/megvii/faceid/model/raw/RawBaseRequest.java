package com.megvii.faceid.model.raw;

import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

public abstract class RawBaseRequest extends BaseRequest implements IKeyRequest
{
    private String bizNo;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
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
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
