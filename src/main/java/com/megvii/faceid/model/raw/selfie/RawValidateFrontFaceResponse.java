package com.megvii.faceid.model.raw.selfie;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.util.Const;

public class RawValidateFrontFaceResponse extends BaseResponse
{
    @SerializedName(Const.API_PARAM_BIZ_NO)
    private String bizNo;
    @SerializedName(Const.API_PARAM_TOKEN_FRONT_FACE)
    private String tokenFrontFace;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public String getTokenFrontFace()
    {
        return tokenFrontFace;
    }

    public void setTokenFrontFace(String tokenFrontFace)
    {
        this.tokenFrontFace = tokenFrontFace;
    }
}
