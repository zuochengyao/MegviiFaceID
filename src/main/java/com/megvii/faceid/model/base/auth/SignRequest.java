package com.megvii.faceid.model.base.auth;

import com.megvii.faceid.model.base.BaseRequest;
import com.megvii.faceid.util.Const;

public abstract class SignRequest extends BaseRequest
{
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
