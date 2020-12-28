package com.megvii.faceid.model.verify.v3;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.auth.ISignRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class VerifyV3Request extends BaseRequest implements ISignRequest
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

    @Override
    public void setSign(String sign)
    {
        this.sign = sign;
        this.addStringParam(Const.API_PARAM_SIGN, sign);
    }

    @Override
    public void setSignVersion(String signVersion)
    {
        this.signVersion = signVersion;
        this.addStringParam(Const.API_PARAM_SIGN_VERSION, signVersion);
    }
}
