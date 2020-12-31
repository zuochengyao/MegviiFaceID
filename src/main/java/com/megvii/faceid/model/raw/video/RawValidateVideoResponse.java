package com.megvii.faceid.model.raw.video;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.util.Const;

public class RawValidateVideoResponse extends BaseResponse
{
    @SerializedName(Const.API_PARAM_BIZ_NO)
    private String bizNo;
    @SerializedName(Const.API_PARAM_TOKEN_VIDEO)
    private String tokenVideo;
    @SerializedName(Const.API_PARAM_IMAGE_BEST)
    private String imageBest;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public String getTokenVideo()
    {
        return tokenVideo;
    }

    public void setTokenVideo(String tokenVideo)
    {
        this.tokenVideo = tokenVideo;
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
