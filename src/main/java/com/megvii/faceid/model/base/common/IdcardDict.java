package com.megvii.faceid.model.base.common;

public class IdcardDict
{
    private String result;
    private float quality;
    private int logic;
    private PointRect rect;

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public float getQuality()
    {
        return quality;
    }

    public void setQuality(float quality)
    {
        this.quality = quality;
    }

    public int getLogic()
    {
        return logic;
    }

    public void setLogic(int logic)
    {
        this.logic = logic;
    }

    public PointRect getRect()
    {
        return rect;
    }

    public void setRect(PointRect rect)
    {
        this.rect = rect;
    }
}
