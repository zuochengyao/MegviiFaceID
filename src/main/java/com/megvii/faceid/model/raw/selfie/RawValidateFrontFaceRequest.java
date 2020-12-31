package com.megvii.faceid.model.raw.selfie;

public class RawValidateFrontFaceRequest extends RawSelfieRequest
{
    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_front_face ";
    }
}