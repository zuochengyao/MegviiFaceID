package com.megvii.faceid.model.verify.v3;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.model.common.Result;

public class VerifyV3Response extends BaseResponse
{
    @SerializedName("biz_no")
    private String bizNo;
    @SerializedName("result_code")
    private Integer resultCode;
    @SerializedName("result_message")
    private String resultMessage;
    private Verification verification;
    @SerializedName("attack_result")
    private AttackResult attackResult;
    private Images images;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public int getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(int resultCode)
    {
        this.resultCode = resultCode;
    }

    public String getResultMessage()
    {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage)
    {
        this.resultMessage = resultMessage;
    }

    public Verification getVerification()
    {
        return verification;
    }

    public void setVerification(Verification verification)
    {
        this.verification = verification;
    }

    public AttackResult getAttackResult()
    {
        return attackResult;
    }

    public void setAttackResult(AttackResult attackResult)
    {
        this.attackResult = attackResult;
    }

    public Images getImages()
    {
        return images;
    }

    public void setImages(Images images)
    {
        this.images = images;
    }

    public static class Verification
    {
        private Result idcard;
        private Result ref1;
        private Result ref2;

        public Result getIdcard()
        {
            return idcard;
        }

        public void setIdcard(Result idcard)
        {
            this.idcard = idcard;
        }

        public Result getRef1()
        {
            return ref1;
        }

        public void setRef1(Result ref1)
        {
            this.ref1 = ref1;
        }

        public Result getRef2()
        {
            return ref2;
        }

        public void setRef2(Result ref2)
        {
            this.ref2 = ref2;
        }
    }

    public static class AttackResult
    {
        private double score;
        private float threshold;
        private boolean result;

        public double getScore()
        {
            return score;
        }

        public void setScore(double score)
        {
            this.score = score;
        }

        public float getThreshold()
        {
            return threshold;
        }

        public void setThreshold(float threshold)
        {
            this.threshold = threshold;
        }

        public boolean isResult()
        {
            return result;
        }

        public void setResult(boolean result)
        {
            this.result = result;
        }
    }

    public static class Images
    {
        @SerializedName("image_best")
        private String imageBest;

        public String getImageBest()
        {
            return imageBest;
        }

        public void setImageBest(String imageBest)
        {
            this.imageBest = imageBest;
        }
    }
}
