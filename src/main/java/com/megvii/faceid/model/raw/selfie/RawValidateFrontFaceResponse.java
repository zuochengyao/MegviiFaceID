package com.megvii.faceid.model.raw.selfie;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.raw.RawBaseResponse;
import com.megvii.faceid.util.Const;

public class RawValidateFrontFaceResponse extends RawBaseResponse
{
    @SerializedName(Const.API_PARAM_TOKEN_FRONT_FACE)
    private String tokenFrontFace;

    public String getTokenFrontFace()
    {
        return tokenFrontFace;
    }

    public void setTokenFrontFace(String tokenFrontFace)
    {
        this.tokenFrontFace = tokenFrontFace;
    }
}
