package com.megvii.faceid.model.raw.video.number;

import com.megvii.faceid.model.raw.video.RawVideoRequest;
import com.megvii.faceid.util.Const;

public class RawValidateVideoRequest extends RawVideoRequest
{
    private String tokenRandomNumber;

    public String getTokenRandomNumber()
    {
        return tokenRandomNumber;
    }

    public void setTokenRandomNumber(String tokenRandomNumber)
    {
        this.tokenRandomNumber = tokenRandomNumber;
        this.addStringParam(Const.API_PARAM_TOKEN_RANDOM_NUMBER, tokenRandomNumber);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_video";
    }
}
