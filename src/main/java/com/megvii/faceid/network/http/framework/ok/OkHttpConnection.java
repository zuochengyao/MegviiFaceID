package com.megvii.faceid.network.http.framework.ok;

import com.megvii.faceid.model.base.BaseRequestModel;
import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpRequest;
import com.megvii.faceid.network.http.HttpResponse;
import com.megvii.faceid.network.http.base.HttpMethod;
import com.megvii.faceid.network.http.framework.IHttpConnection;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
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
    public HttpResponse execute(HttpRequest request) throws IOException
    {
        Call call;
        HttpMethod method = request.getHttpMethod();
        mRequestBuilder = new Request.Builder().url(request.getUrl());
        switch (method)
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
        Response response = call.execute();
        System.out.println(response.body().string());
        return null;
    }

    @Override
    public void enqueue(HttpRequest request) throws IOException
    {

    }

    private Call newPostCall(BaseRequestModel model)
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

    private Call newGetCall(BaseRequestModel model)
    {
        return mOkHttpClient.newCall(mRequestBuilder.build());
    }

}
