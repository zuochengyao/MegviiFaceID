package com.megvii.faceid.network.http.base;

import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.HttpMethod;

public interface IRequest
{
    String getUrl();

    HttpMethod method();

    HttpHeader headers();

    void addHeader(String key, String value);
}
