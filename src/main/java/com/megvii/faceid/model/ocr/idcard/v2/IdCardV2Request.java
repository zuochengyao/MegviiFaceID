package com.megvii.faceid.model.ocr.idcard.v2;

import com.megvii.faceid.model.ocr.idcard.IdCardBaseRequest;
import com.megvii.faceid.http.base.HttpMethod;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

public class IdCardV2Request extends IdCardBaseRequest
{
    private String returnPortrait;

    public String getReturnPortrait()
    {
        return returnPortrait;
    }

    public void setReturnPortrait(String returnPortrait)
    {
        this.returnPortrait = returnPortrait;
        this.addStringParam(Const.API_PARAM_RETURN_PORTRAIT, returnPortrait);
    }

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/v3/ocridcard";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
