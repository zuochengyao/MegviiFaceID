package com.megvii.faceid.model.detect;

import com.megvii.faceid.common.Const;
import com.megvii.faceid.common.Utils;
import com.megvii.faceid.model.base.BaseKeyModel;

import java.io.File;

public class DetectRequest extends BaseKeyModel
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
    protected void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_MULTI_ORIENTED_DETECTION, multiOrientedDetection);
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }
}
