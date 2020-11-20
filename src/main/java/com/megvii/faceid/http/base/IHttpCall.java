package com.megvii.faceid.http.base;

import java.io.IOException;
import java.net.URI;

public interface IHttpCall
{
    HttpMethod getMethod();

    URI getUri();

    IHttpResponse execute() throws IOException;

    void enqueue() throws IOException;

    void download() throws IOException;
}
