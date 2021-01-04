package com.megvii.faceid.http.base;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public interface IResponse extends Closeable
{
    long getContentLength();

    HttpHeader getHeaders();

    HttpStatus getStatus();

    String getMessage();

    InputStream getBody() throws IOException;

    void close() throws IOException;
}
