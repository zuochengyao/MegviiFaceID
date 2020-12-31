package com.megvii.faceid.model.raw.video.number;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.raw.RawBaseResponse;
import com.megvii.faceid.util.Const;

public class RawGetRandomNumberResponse extends RawBaseResponse
{
    @SerializedName(Const.API_PARAM_TOKEN_RANDOM_NUMBER)
    private String tokenRandomNumber;
    @SerializedName(Const.API_PARAM_RANDOM_NUMBER)
    private String randomNumber;

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
