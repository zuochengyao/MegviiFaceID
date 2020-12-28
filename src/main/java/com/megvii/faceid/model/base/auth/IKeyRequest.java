package com.megvii.faceid.model.base.auth;

public interface IKeyRequest extends IRequest
{
    void setApiKey(String apiKey);

    void setApiSecret(String apiSecret);
}
