package com.megvii.faceid.network.http.impl;

import com.megvii.faceid.network.http.HttpHeader;
import com.megvii.faceid.network.http.base.ICall;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public abstract class HttpCall implements ICall
{
    private static final String GZIP = "gzip";
    private ZipOutputStream mZipOutStream;
    private ByteArrayOutputStream mByteArray = new ByteArrayOutputStream();

    private boolean isExecuted = false;

    protected void checkExecuted() throws IOException
    {
        synchronized (this)
        {
            if (isExecuted)
                throw new IllegalStateException("The Request Already Executed");
            isExecuted = true;
        }
        if (mZipOutStream != null)
            mZipOutStream.close();
    }

    public OutputStream getBody()
    {
        OutputStream body = getBodyOutputStream();
        if (isGzip())
            return getGzipOutputStream(body);
        return body;
    }

    protected OutputStream getBodyOutputStream()
    {
        return mByteArray;
    }

    protected byte[] getBodyData()
    {
        return mByteArray.toByteArray();
    }

    private boolean isGzip()
    {
        String contentEncoding = getHeaders().getContentEncoding();
        return GZIP.equals(contentEncoding);
    }

    private OutputStream getGzipOutputStream(OutputStream body)
    {
        if (this.mZipOutStream == null)
            this.mZipOutStream = new ZipOutputStream(body);
        return this.mZipOutStream;
    }

    protected abstract HttpHeader getHeaders();
}
