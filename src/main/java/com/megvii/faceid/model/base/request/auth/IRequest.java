package com.megvii.faceid.model.base.request.auth;

import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.HttpMethod;

public interface IRequest
{
    String getUrl();

    HttpMethod method();

    HttpHeader headers();

    void addHeader(String key, String value);
}
