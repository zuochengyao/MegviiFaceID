package com.megvii.faceid.model.raw.video.still;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.raw.RawBaseResponse;
import com.megvii.faceid.util.Const;

public class RawValidateStillResponse extends RawBaseResponse
{
    @SerializedName(Const.API_PARAM_TOKEN_STILL)
    private String tokenStill;
    @SerializedName(Const.API_PARAM_IMAGE_BEST)
    private String imageBest;

    public String getTokenStill()
    {
        return tokenStill;
    }

    public void setTokenStill(String tokenStill)
    {
        this.tokenStill = tokenStill;
    }

    public String getImageBest()
    {
        return imageBest;
    }

    public void setImageBest(String imageBest)
    {
        this.imageBest = imageBest;
    }
}
