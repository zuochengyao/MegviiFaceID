package com.megvii.faceid.model.pc;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.model.common.ImageList;
import com.megvii.faceid.model.verify.v2.VerifyV2Response;
import com.megvii.faceid.util.Const;

public class PcGetResultResponse extends BaseResponse
{
    @SerializedName(Const.API_PARAM_BIZ_ID)
    private String bizId;
    @SerializedName(Const.API_PARAM_BIZ_NO)
    private String bizNo;
    @SerializedName(Const.API_PARAM_BIZ_EXTRA_DATA)
    private String bizExtraData;
    @SerializedName(Const.API_PARAM_LIVENESS_RESULT)
    private LivenessResult livenessResult;
    @SerializedName(Const.API_PARAM_VERIFY_RESULT)
    private VerifyV2Response verifyResult;
    private ImageList images;

    public String getBizId()
    {
        return bizId;
    }

    public void setBizId(String bizId)
    {
        this.bizId = bizId;
    }

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public String getBizExtraData()
    {
        return bizExtraData;
    }

    public void setBizExtraData(String bizExtraData)
    {
        this.bizExtraData = bizExtraData;
    }

    public LivenessResult getLivenessResult()
    {
        return livenessResult;
    }

    public void setLivenessResult(LivenessResult livenessResult)
    {
        this.livenessResult = livenessResult;
    }

    public VerifyV2Response getVerifyResult()
    {
        return verifyResult;
    }

    public void setVerifyResult(VerifyV2Response verifyResult)
    {
        this.verifyResult = verifyResult;
    }

    public ImageList getImages()
    {
        return images;
    }

    public void setImages(ImageList images)
    {
        this.images = images;
    }

    public static class LivenessResult
    {
        private String result;
        private String version;
        @SerializedName(Const.API_PARAM_FAILURE_REASON)
        private String failureReason;
        private String log;
        private String datetime;

        public String getResult()
        {
            return result;
        }

        public void setResult(String result)
        {
            this.result = result;
        }

        public String getVersion()
        {
            return version;
        }

        public void setVersion(String version)
        {
            this.version = version;
        }

        public String getFailureReason()
        {
            return failureReason;
        }

        public void setFailureReason(String failureReason)
        {
            this.failureReason = failureReason;
        }

        public String getLog()
        {
            return log;
        }

        public void setLog(String log)
        {
            this.log = log;
        }

        public String getDatetime()
        {
            return datetime;
        }

        public void setDatetime(String datetime)
        {
            this.datetime = datetime;
        }
    }
}
