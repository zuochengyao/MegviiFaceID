package com.megvii.faceid.model.raw;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.util.Const;

public class RawGetRandomNumberResponse extends BaseResponse
{
    @SerializedName(Const.API_PARAM_BIZ_NO)
    private String bizNo;
    @SerializedName(Const.API_PARAM_TOKEN_RANDOM_NUMBER)
    private String tokenRandomNumber;
    @SerializedName(Const.API_PARAM_RANDOM_NUMBER)
    private String randomNumber;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public String getTokenRandomNumber()
    {
        return tokenRandomNumber;
    }

    public void setTokenRandomNumber(String tokenRandomNumber)
    {
        this.tokenRandomNumber = tokenRandomNumber;
    }

    public String getRandomNumber()
    {
        return randomNumber;
    }

    public void setRandomNumber(String randomNumber)
    {
        this.randomNumber = randomNumber;
    }
}
