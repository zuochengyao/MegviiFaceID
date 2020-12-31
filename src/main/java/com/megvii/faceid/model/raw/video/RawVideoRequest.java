package com.megvii.faceid.model.raw.video;

import com.megvii.faceid.model.raw.RawBaseRequest;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public abstract class RawVideoRequest extends RawBaseRequest
{
    protected byte[] video;
    protected String returnImage;

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
}
