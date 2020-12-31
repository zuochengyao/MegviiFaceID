package com.megvii.faceid.model.raw.selfie;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.raw.RawBaseResponse;
import com.megvii.faceid.util.Const;

public class RawValidateSideFaceResponse extends RawBaseResponse
{
    @SerializedName(Const.API_PARAM_TOKEN_SIDE_FACE)
    private String tokenSideFace;

    public String getTokenSideFace()
    {
        return tokenSideFace;
    }

    public void setTokenSideFace(String tokenSideFace)
    {
        this.tokenSideFace = tokenSideFace;
    }
}
