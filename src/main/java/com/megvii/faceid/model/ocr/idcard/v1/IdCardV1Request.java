package com.megvii.faceid.model.ocr.idcard.v1;

import com.megvii.faceid.http.base.HttpMethod;
import com.megvii.faceid.model.ocr.idcard.IdCardBaseRequest;
import com.megvii.faceid.util.Const;

public class IdCardV1Request extends IdCardBaseRequest
{
    private String legality;

    public String getLegality()
    {
        return legality;
    }

    public void setLegality(String legality)
    {
        this.legality = legality;
        this.addStringParam(Const.API_PARAM_LEGALITY, legality);
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
}
