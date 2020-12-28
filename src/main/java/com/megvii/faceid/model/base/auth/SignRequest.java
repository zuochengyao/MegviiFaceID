package com.megvii.faceid.model.base.auth;

import com.megvii.faceid.model.base.BaseRequest;
import com.megvii.faceid.util.Const;

public abstract class SignRequest extends BaseRequest
{
    protected String sign;
    protected String signVersion;

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
        this.addStringParam(Const.API_PARAM_SIGN, sign);
    }

    public String getSignVersion()
    {
        return "hmac_sha1";
    }

    public void setSignVersion(String signVersion)
    {
        this.signVersion = signVersion;
        this.addStringParam(Const.API_PARAM_SIGN_VERSION, getSignVersion());
    }
}
