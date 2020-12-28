package com.megvii.faceid.model.ocr.bankcard;

import com.megvii.faceid.model.base.auth.KeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class BankCardRequest extends KeyRequest
{
    private byte[] image;

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

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/v3/ocrbankcard";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
