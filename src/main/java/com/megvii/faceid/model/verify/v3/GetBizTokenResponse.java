package com.megvii.faceid.model.verify.v3;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;

public class GetBizTokenResponse extends BaseResponse
{
    @SerializedName("biz_token")
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
