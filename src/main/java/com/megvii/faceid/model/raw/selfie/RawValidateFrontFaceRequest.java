package com.megvii.faceid.model.raw.selfie;

import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class RawValidateFrontFaceRequest extends BaseRequest implements IKeyRequest
{
    private String bizNo;
    private byte[] selfie;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
    }

    public byte[] getSelfie()
    {
        return selfie;
    }

    public void setSelfie(File selfie)
    {
        if (selfie != null)
            this.setSelfie(CommonUtils.getFileBytes(selfie));
    }

    public void setSelfie(byte[] selfie)
    {
        this.selfie = selfie;
        this.addBinaryParam(Const.API_PARAM_SELFIE, selfie);
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

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_front_face ";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
