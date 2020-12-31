package com.megvii.faceid.model.raw.video;

import com.megvii.faceid.model.raw.RawBaseRequest;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class RawValidateVideoRequest extends RawBaseRequest
{
    private String tokenRandomNumber;
    private byte[] video;
    private String returnImage;

    public String getTokenRandomNumber()
    {
        return tokenRandomNumber;
    }

    public void setTokenRandomNumber(String tokenRandomNumber)
    {
        this.tokenRandomNumber = tokenRandomNumber;
        this.addStringParam(Const.API_PARAM_TOKEN_RANDOM_NUMBER, tokenRandomNumber);
    }

    public byte[] getVideo()
    {
        return video;
    }

    public void setVideo(File video)
    {
        if (video != null)
            setVideo(CommonUtils.getFileBytes(video));
    }

    public void setVideo(byte[] video)
    {
        this.video = video;
        this.addBinaryParam(Const.API_PARAM_VIDEO, video);
    }

    public String getReturnImage()
    {
        return returnImage;
    }

    public void setReturnImage(String returnImage)
    {
        this.returnImage = returnImage;
        this.addStringParam(Const.API_PARAM_RETURN_IMAGE, returnImage);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_video";
    }
}
