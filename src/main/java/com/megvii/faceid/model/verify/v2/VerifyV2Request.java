package com.megvii.faceid.model.verify.v2;

import com.megvii.faceid.model.base.request.ApiKeyRequest;
import com.megvii.faceid.network.http.HttpMethod;

public class VerifyV2Request extends ApiKeyRequest
{
    
    @Override
    public String getUrl()
    {
        return "/faceid/v2/verify";
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

    }
}
