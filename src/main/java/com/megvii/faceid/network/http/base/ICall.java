package com.megvii.faceid.network.http.base;

import com.megvii.faceid.network.http.HttpMethod;

import java.io.IOException;
import java.net.URI;

public interface ICall
{
    HttpMethod getMethod();

    URI getUri();

    IResponse execute() throws IOException;

    void enqueue() throws IOException;

    void download() throws IOException;
}
