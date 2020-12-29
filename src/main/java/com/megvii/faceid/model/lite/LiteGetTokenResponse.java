package com.megvii.faceid.model.lite;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.util.Const;

public class LiteGetTokenResponse extends BaseResponse
{
    private String token;
    @SerializedName(Const.API_PARAM_BIZ_ID)
    private String bizId;
    @SerializedName(Const.API_PARAM_EXPIRED_TIME)
    private int expiredTime;

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getBizId()
    {
        return bizId;
    }

    public void setBizId(String bizId)
    {
        this.bizId = bizId;
    }

    public int getExpiredTime()
    {
        return expiredTime;
    }

    public void setExpiredTime(int expiredTime)
    {
        this.expiredTime = expiredTime;
    }
}
