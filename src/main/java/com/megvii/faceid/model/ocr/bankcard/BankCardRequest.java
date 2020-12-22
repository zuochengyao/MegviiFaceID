package com.megvii.faceid.model.ocr.bankcard;

import com.megvii.faceid.model.base.request.ApiKeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class BankCardRequest extends ApiKeyRequest
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
    }

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

    @Override
    public void toMap()
    {
        super.toMap();
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }
}