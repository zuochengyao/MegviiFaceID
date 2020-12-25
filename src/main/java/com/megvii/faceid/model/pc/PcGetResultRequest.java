package com.megvii.faceid.model.pc;

import com.megvii.faceid.model.base.auth.KeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

public class PcGetResultRequest extends KeyRequest
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
    }

    public int getGetImageType()
    {
        return getImageType;
    }

    public void setGetImageType(int getImageType)
    {
        this.getImageType = getImageType;
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
    public void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_BIZ_ID, bizId);
        if (getImageType != 0)
            this.addStringParam(Const.API_PARAM_GET_IMAGE_TYPE, getImageType);
    }
}
