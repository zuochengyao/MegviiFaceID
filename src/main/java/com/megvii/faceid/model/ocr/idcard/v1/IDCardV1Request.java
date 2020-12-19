package com.megvii.faceid.model.ocr.idcard.v1;

import com.megvii.faceid.model.ocr.idcard.BaseIDCardRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

public class IDCardV1Request extends BaseIDCardRequest
{
    private String legality;

    public String getLegality()
    {
        return legality;
    }

    public void setLegality(String legality)
    {
        this.legality = legality;
    }

    @Override
    public String getUrl()
    {
        return "/faceid/v1/ocridcard";
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
        this.addStringParam(Const.API_PARAM_LEGALITY, legality);
    }
}
