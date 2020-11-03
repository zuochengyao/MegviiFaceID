package com.megvii.faceid.network.http.base;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public interface IHttpResponse extends Closeable
{
    long getContentLength();

    HttpStatus getStatus();

    HttpHeader getHeaders();

    String getStatusMessage();

    InputStream getBody() throws IOException;

    void close() throws IOException;
}
