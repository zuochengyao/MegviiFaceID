package com.megvii.faceid.model.ocr.idcard.v2;

import com.megvii.faceid.model.ocr.idcard.BaseIdCardRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

public class IdCardV2Request extends BaseIdCardRequest
{
    private String returnPortrait;

    public String getReturnPortrait()
    {
        return returnPortrait;
    }

    public void setReturnPortrait(String returnPortrait)
    {
        this.returnPortrait = returnPortrait;
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

    @Override
    public void toMap()
    {
        super.toMap();
        if (!CommonUtils.isNullOrEmpty(returnPortrait))
            this.addStringParam(Const.API_PARAM_RETURN_PORTRAIT, returnPortrait);
    }
}
