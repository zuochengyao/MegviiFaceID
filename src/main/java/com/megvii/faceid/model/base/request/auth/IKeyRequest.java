package com.megvii.faceid.model.base.request.auth;

public interface IKeyRequest extends IRequest
{
    void setApiKey(String apiKey);

    void setApiSecret(String apiSecret);
}
