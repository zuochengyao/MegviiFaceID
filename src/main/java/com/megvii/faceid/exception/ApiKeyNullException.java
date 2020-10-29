package com.megvii.faceid.exception;

public class ApiKeyNullException extends NullPointerException
{
    public ApiKeyNullException()
    {
        super("ApiKey is NULL");
    }
}
