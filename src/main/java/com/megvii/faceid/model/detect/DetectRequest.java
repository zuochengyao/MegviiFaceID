package com.megvii.faceid.model.detect;

import com.megvii.faceid.util.Const;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.model.base.auth.KeyRequest;
import com.megvii.faceid.network.http.HttpMethod;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class DetectRequest extends KeyRequest
{
    private byte[] image;
    private String multiOrientedDetection;

    public byte[] getImage()
    {
        return this.image;
    }

    public void setImage(File image)
    {
        if (image != null)
            setImage(CommonUtils.getFileBytes(image));
    }

    public void setImage(byte[] image)
    {
        this.image = image;
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }

    public String getMultiOrientedDetection()
    {
        return multiOrientedDetection;
    }

    public void setMultiOrientedDetection(String multiOrientedDetection)
    {
        this.multiOrientedDetection = multiOrientedDetection;
        this.addStringParam(Const.API_PARAM_MULTI_ORIENTED_DETECTION, multiOrientedDetection);
    }

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/v1/detect";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
