package com.megvii.faceid.model.raw;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.util.Const;

public abstract class RawBaseResponse extends BaseResponse
{
    @SerializedName(Const.API_PARAM_BIZ_NO)
    protected String bizNo;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }
}
