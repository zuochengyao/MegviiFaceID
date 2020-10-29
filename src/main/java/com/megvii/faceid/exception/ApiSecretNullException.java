package com.megvii.faceid.exception;

public class ApiSecretNullException extends NullPointerException
{
    public ApiSecretNullException()
    {
        super("ApiSecret is NULL");
    }
}
