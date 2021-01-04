package com.megvii.faceid.model.base.request.auth;

import com.megvii.faceid.http.base.HttpHeader;
import com.megvii.faceid.http.base.HttpMethod;

public interface IRequest
{
    String getUrl();

    HttpMethod method();

    HttpHeader headers();

    void addHeader(String key, String value);
}
