package com.megvii.faceid.model.pc;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.util.Const;

public class PcGetTokenResponse extends BaseResponse
{
    private String token;
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

    public int getExpiredTime()
    {
        return expiredTime;
    }

    public void setExpiredTime(int expiredTime)
    {
        this.expiredTime = expiredTime;
    }
}
