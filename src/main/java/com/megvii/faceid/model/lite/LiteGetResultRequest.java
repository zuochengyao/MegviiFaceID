package com.megvii.faceid.model.lite;

import com.megvii.faceid.model.base.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

public class LiteGetResultRequest extends BaseRequest implements IKeyRequest
{
    private String bizId;
    private String returnImage;

    public String getBizId()
    {
        return bizId;
    }

    public void setBizId(String bizId)
    {
        this.bizId = bizId;
        this.addStringParam(Const.API_PARAM_BIZ_ID, bizId);
    }

    public String getReturnImage()
    {
        return returnImage;
    }

    public void setReturnImage(String returnImage)
    {
        this.returnImage = returnImage;
        this.addStringParam(Const.API_PARAM_RETURN_IMAGE, returnImage);
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
        return "/faceid/lite/get_result";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.GET;
    }
}
