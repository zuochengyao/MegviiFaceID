package com.megvii.faceid.network.framework.ok;

import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.HttpConfig;
import com.megvii.faceid.network.HttpRequest;
import com.megvii.faceid.network.HttpResponse;
import com.megvii.faceid.network.framework.IHttpConnection;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
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
        // HttpResponse realResponse = HttpResponse.newResponse();
        if (okResponse.body() != null)
        {
            String respJson = okResponse.body().string();
        }
        return null;
    }

    @Override
    public void enqueue(HttpRequest request) throws IOException
    {
        newCall(request).enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {

            }
        });
    }

    private Call newCall(HttpRequest request)
    {
        Call call;
        mRequestBuilder = new Request.Builder().url(request.getUrl());
        switch (request.method())
        {
            default:
            case GET:
            {
                call = newGetCall(request.getData());
                break;
            }
            case POST:
            {
                call = newPostCall(request.getData());
                break;
            }
        }
        return call;
    }

    private Call newPostCall(BaseRequest model)
    {
        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (Map.Entry<String, Object> entry : model.getParams().entrySet())
        {
            Object val = entry.getValue();
            if (val instanceof String)
                builder.addFormDataPart(entry.getKey(), String.valueOf(val));
            else
                builder.addFormDataPart(entry.getKey(), entry.getKey(), RequestBody.create(MultipartBody.FORM, (byte[]) val));
        }
        MultipartBody body = builder.build();
        return mOkHttpClient.newCall(mRequestBuilder.post(body).build());
    }

    private Call newGetCall(BaseRequest model)
    {
        return mOkHttpClient.newCall(mRequestBuilder.build());
    }

}
