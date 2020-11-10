package com.megvii.faceid.model.base;

import com.google.gson.annotations.SerializedName;

public abstract class BaseSignModel extends BaseModel
{
    @SerializedName("sign")
    private String sign;
    // private final String signVersion = "hmac_sha1";

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
}
