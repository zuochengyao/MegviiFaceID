package com.megvii.faceid.model.verify.v3;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.auth.SignRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class VerifyV3Request extends SignRequest
{
    @SerializedName("biz_token")
    private String bizToken;
    @SerializedName("meglive_data")
    private byte[] megliveData;

    public String getBizToken()
    {
        return bizToken;
    }

    public void setBizToken(String bizToken)
    {
        this.bizToken = bizToken;
        this.addStringParam(Const.API_PARAM_BIZ_TOKEN, bizToken);
    }

    public byte[] getMegliveData()
    {
        return megliveData;
    }

    public void setMegliveData(byte[] megliveData)
    {
        this.megliveData = megliveData;
        this.addBinaryParam(Const.API_PARAM_MEGLIVE_DATA, megliveData);
    }

    public void setMegliveData(File megliveData)
    {
        if (megliveData != null)
            setMegliveData(CommonUtils.getFileBytes(megliveData));
    }

    @Override
    public String getUrl()
    {
        return "/faceid/v3/sdk/verify";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
