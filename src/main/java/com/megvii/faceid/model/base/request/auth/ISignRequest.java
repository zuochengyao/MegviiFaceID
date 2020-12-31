package com.megvii.faceid.model.base.request.auth;

public interface ISignRequest extends IRequest
{
    void setSign(String sign);

    void setSignVersion(String signVersion);
}
