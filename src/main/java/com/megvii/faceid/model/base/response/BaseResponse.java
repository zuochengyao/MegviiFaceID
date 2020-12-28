package com.megvii.faceid.model.base.response;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public abstract class BaseResponse
{
    @SerializedName(Const.API_PARAM_REQUEST_ID)
    protected String requestId;
    @SerializedName(Const.API_PARAM_TIME_USED)
    protected int timeUsed;
    @SerializedName(value = Const.API_PARAM_ERROR, alternate = Const.API_PARAM_ERROR_MESSAGE)
    protected String error;

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
