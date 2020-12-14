package com.megvii.faceid.model.base.response;

import com.google.gson.annotations.SerializedName;

public abstract class BaseResponse
{
    @SerializedName("request_id")
    private String requestId;
    @SerializedName("time_used")
    private String timeUsed;

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public String getTimeUsed()
    {
        return timeUsed;
    }

    public void setTimeUsed(String timeUsed)
    {
        this.timeUsed = timeUsed;
    }
}
