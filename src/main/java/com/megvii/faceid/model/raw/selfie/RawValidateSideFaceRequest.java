package com.megvii.faceid.model.raw.selfie;

import com.megvii.faceid.util.Const;

public class RawValidateSideFaceRequest extends RawSelfieRequest
{
    private String tokenFrontFace;

    public String getTokenFrontFace()
    {
        return tokenFrontFace;
    }

    public void setTokenFrontFace(String tokenFrontFace)
    {
        this.tokenFrontFace = tokenFrontFace;
        this.addStringParam(Const.API_PARAM_TOKEN_FRONT_FACE, tokenFrontFace);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_side_face ";
    }
}
