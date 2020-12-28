package com.megvii.faceid.model.pc;

import com.megvii.faceid.model.base.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

public class PcGetResultRequest extends BaseRequest implements IKeyRequest
{
    private String bizId;
    private int getImageType = 0;

    public String getBizId()
    {
        return bizId;
    }

    public void setBizId(String bizId)
    {
        this.bizId = bizId;
        this.addStringParam(Const.API_PARAM_BIZ_ID, bizId);
    }

    public int getGetImageType()
    {
        return getImageType;
    }

    public void setGetImageType(int getImageType)
    {
        this.getImageType = getImageType;
        this.addStringParam(Const.API_PARAM_GET_IMAGE_TYPE, getImageType);
    }

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/liveness/v2/get_result";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.GET;
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
}
