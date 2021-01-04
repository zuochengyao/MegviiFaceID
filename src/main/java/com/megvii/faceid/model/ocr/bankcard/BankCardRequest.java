package com.megvii.faceid.model.ocr.bankcard;

import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.http.base.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class BankCardRequest extends BaseRequest implements IKeyRequest
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

    @Override
    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
    }

    @Override
    public void setApiSecret(String apiSecret)
    {
        this.apiSecret = apiSecret;
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }
}
