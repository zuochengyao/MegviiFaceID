package com.megvii.faceid.model.detect;

import com.megvii.faceid.common.Const;
import com.megvii.faceid.common.Utils;
import com.megvii.faceid.model.base.request.BaseKeyRequest;
import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.HttpMethod;

import java.io.File;

public class DetectRequest extends BaseKeyRequest
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
            setImage(Utils.getFileBytes(image));
    }

    public void setImage(byte[] image)
    {
        this.image = image;
    }

    public String getMultiOrientedDetection()
    {
        return multiOrientedDetection;
    }

    public void setMultiOrientedDetection(String multiOrientedDetection)
    {
        this.multiOrientedDetection = multiOrientedDetection;
    }

    @Override
    public void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_MULTI_ORIENTED_DETECTION, 1);
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }

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

    @Override
    public HttpHeader headers()
    {
        return null;
    }
}
