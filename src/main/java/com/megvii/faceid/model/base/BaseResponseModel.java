package com.megvii.faceid.model.base;

public abstract class BaseResponseModel extends BaseModel
{
    private String requestId;
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
