package com.megvii.faceid.model.common;

import com.google.gson.annotations.SerializedName;

public class FaceInfo
{
    private float quality;
    @SerializedName("quality_threshold")
    private float qualityThreshold;
    private RectF rect;
    private int orientation;

    public float getQuality()
    {
        return quality;
    }

    public void setQuality(float quality)
    {
        this.quality = quality;
    }

    public float getQualityThreshold()
    {
        return qualityThreshold;
    }

    public void setQualityThreshold(float qualityThreshold)
    {
        this.qualityThreshold = qualityThreshold;
    }

    public RectF getRect()
    {
        return rect;
    }

    public void setRect(RectF rect)
    {
        this.rect = rect;
    }

    public int getOrientation()
    {
        return orientation;
    }

    public void setOrientation(int orientation)
    {
        this.orientation = orientation;
    }
}
