package com.megvii.faceid.model.ocr;

import com.megvii.faceid.common.Const;
import com.megvii.faceid.common.Utils;
import com.megvii.faceid.model.base.request.BaseKeyRequest;
import com.megvii.faceid.network.http.HttpMethod;

import java.io.File;

public class IdCardRequest extends BaseKeyRequest
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
    public String getUrl()
    {
        return "/faceid/v3/ocridcard";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }

    @Override
    public void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_RETURN_PORTRAIT, returnPortrait);
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }
}
