package com.megvii.faceid.http.framework.ok;

import com.megvii.faceid.http.HttpConfig;
import com.megvii.faceid.http.HttpRequest;
import com.megvii.faceid.http.HttpResponse;
import com.megvii.faceid.http.framework.IHttpConnection;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpConnection extends IHttpConnection
{
    private final OkHttpClient mOkHttpClient;
    private Request.Builder mRequestBuilder;

    public OkHttpConnection(HttpConfig config)
    {
        super(config);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(config.getConnectTimeout(), TimeUnit.MILLISECONDS)
               .readTimeout(config.getReadTimeout(), TimeUnit.MILLISECONDS)
               .writeTimeout(config.getWriteTimeout(), TimeUnit.MILLISECONDS)/*.proxy(config.getProxy())*/;
        mOkHttpClient = builder.build();
    }

    @Override
    public HttpResponse execute(@NotNull HttpRequest request) throws IOException
    {
        Response okResponse = newCall(request).execute();
        return new OkHttpResponse(okResponse);
    }

    private Call newCall(HttpRequest request)
    {
        Call call;
        mRequestBuilder = new Request.Builder();
        if (request.getHeader() != null && request.getHeader().size() > 0)
        {
            for (Map.Entry<String, String> entry : request.getHeader().entrySet())
                mRequestBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        switch (request.method())
        {
            default:
            case GET:
            {
                call = newGetCall(request);
                break;
            }
            case POST:
            {
                call = newPostCall(request);
                break;
            }
        }
        return call;
    }

    private Call newPostCall(HttpRequest request)
    {
        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (Map.Entry<String, Object> entry : request.getData().entrySet())
        {
            Object val = entry.getValue();
            if (val instanceof String)
                builder.addFormDataPart(entry.getKey(), String.valueOf(val));
            else
                builder.addFormDataPart(entry.getKey(), entry.getKey(), RequestBody.create(MultipartBody.FORM, (byte[]) val));
        }
        MultipartBody body = builder.build();
        return mOkHttpClient.newCall(mRequestBuilder.url(request.getUrl()).post(body).build());
    }

    private Call newGetCall(HttpRequest request)
    {
        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(request.getUrl())).newBuilder();
        for (Map.Entry<String, Object> entry : request.getData().entrySet())
            urlBuilder.addQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
        return mOkHttpClient.newCall(mRequestBuilder.url(urlBuilder.build()).get().build());
    }

}
