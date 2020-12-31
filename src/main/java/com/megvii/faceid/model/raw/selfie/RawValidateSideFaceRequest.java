package com.megvii.faceid.model.raw.selfie;

import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpMethod;

public class RawValidateSideFaceRequest extends BaseRequest implements IKeyRequest
{
    private String bizNo;
    private String tokenFrontFace;
    private byte[] selfie;

    @Override
    public void setApiKey(String apiKey)
    {

    }

    @Override
    public void setApiSecret(String apiSecret)
    {

    }

    @Override
    public String getUrl()
    {
        return null;
    }

    @Override
    public HttpMethod method()
    {
        return null;
    }
}
