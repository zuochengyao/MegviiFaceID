package com.megvii.faceid.model.verify;

import com.google.gson.annotations.SerializedName;

public class Result
{
    private float confidence;
    private Thresholds thresholds;

    public float getConfidence()
    {
        return confidence;
    }

    public void setConfidence(float confidence)
    {
        this.confidence = confidence;
    }

    public Thresholds getThresholds()
    {
        return thresholds;
    }

    public void setThresholds(Thresholds thresholds)
    {
        this.thresholds = thresholds;
    }

    public static class Thresholds
    {
        @SerializedName("1e-3")
        private float e3;
        @SerializedName("1e-4")
        private float e4;
        @SerializedName("1e-5")
        private float e5;
        @SerializedName("1e-6")
        private float e6;

        public float getE3()
        {
            return e3;
        }

        public void setE3(float e3)
        {
            this.e3 = e3;
        }

        public float getE4()
        {
            return e4;
        }

        public void setE4(float e4)
        {
            this.e4 = e4;
        }

        public float getE5()
        {
            return e5;
        }

        public void setE5(float e5)
        {
            this.e5 = e5;
        }

        public float getE6()
        {
            return e6;
        }

        public void setE6(float e6)
        {
            this.e6 = e6;
        }
    }
}
