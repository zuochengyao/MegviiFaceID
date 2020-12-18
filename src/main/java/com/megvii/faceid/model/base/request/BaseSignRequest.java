package com.megvii.faceid.model.base.request;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public abstract class BaseSignRequest extends BaseRequest
{
    @SerializedName("sign")
    private String sign;

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getSignVersion()
    {
        return "hmac_sha1";
    }

    @Override
    public void toMap()
    {
        this.addStringParam(Const.API_PARAM_SIGN, sign);
        this.addStringParam(Const.API_PARAM_SIGN_VERSION, getSignVersion());
    }
}
