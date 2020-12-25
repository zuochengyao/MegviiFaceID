package com.megvii.faceid.model.verify.v3;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.util.Const;

public class GetBizTokenResponse extends BaseResponse
{
    @SerializedName(Const.API_PARAM_BIZ_TOKEN)
    private String bizToken;

    public String getBizToken()
    {
        return bizToken;
    }

    public void setBizToken(String bizToken)
    {
        this.bizToken = bizToken;
    }
}
