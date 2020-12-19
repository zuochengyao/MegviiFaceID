package com.megvii.faceid.model.ocr.idcard.v2;

import com.megvii.faceid.model.ocr.idcard.BaseIDCardRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

public class IDCardV2Request extends BaseIDCardRequest
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
        this.addStringParam(Const.API_PARAM_RETURN_PORTRAIT, returnPortrait);
    }
}
