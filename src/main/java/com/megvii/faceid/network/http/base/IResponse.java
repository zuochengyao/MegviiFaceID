package com.megvii.faceid.network.http.base;

import com.megvii.faceid.network.http.HttpStatus;
import com.megvii.faceid.network.http.HttpHeader;

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
