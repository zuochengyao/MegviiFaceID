package com.megvii.faceid.model.ocr;

import com.megvii.faceid.common.Const;
import com.megvii.faceid.common.Utils;
import com.megvii.faceid.model.base.BaseKeyModel;

import java.io.File;

public class IDCardRequest extends BaseKeyModel
{
    private byte[] image;
    private String returnPortrait;

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

    public String getReturnPortrait()
    {
        return returnPortrait;
    }

    public void setReturnPortrait(String returnPortrait)
    {
        this.returnPortrait = returnPortrait;
    }

    @Override
    protected void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_RETURN_PORTRAIT, returnPortrait);
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }
}
