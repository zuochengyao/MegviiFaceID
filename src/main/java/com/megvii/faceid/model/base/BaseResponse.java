package com.megvii.faceid.model.base;

import com.google.gson.annotations.SerializedName;

public abstract class BaseResponse
{
    @SerializedName("request_id")
    private String requestId;

    @SerializedName("time_used")
    private int timeUsed;

    @SerializedName(value = "error", alternate = {"error_message"})
    private String error;

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public int getTimeUsed()
    {
        return timeUsed;
    }

    public void setTimeUsed(int timeUsed)
    {
        this.timeUsed = timeUsed;
    }

    public String getError()
    {
        return error;
    }

    public void setError(String error)
    {
        this.error = error;
    }
}
