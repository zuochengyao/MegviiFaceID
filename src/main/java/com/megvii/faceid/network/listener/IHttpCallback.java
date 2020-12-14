package com.megvii.faceid.network.listener;

public interface IHttpCallback<T>
{
    void onSuccess(T data);

    void onFailure(int errorCode, String errorMessage);
}
