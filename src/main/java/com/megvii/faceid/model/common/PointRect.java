package com.megvii.faceid.model.common;

import com.google.gson.annotations.SerializedName;

public class PointRect
{
    @SerializedName(value = "lt", alternate = "left_top")
    private Point lt;
    @SerializedName(value = "lb", alternate = "left_bottom")
    private Point lb;
    @SerializedName(value = "rb", alternate = "right_bottom")
    private Point rb;
    @SerializedName(value = "rt", alternate = "right_top")
    private Point rt;

    public Point getRt()
    {
        return rt;
    }

    public void setRt(Point rt)
    {
        this.rt = rt;
    }

    public Point getLt()
    {
        return lt;
    }

    public void setLt(Point lt)
    {
        this.lt = lt;
    }

    public Point getLb()
    {
        return lb;
    }

    public void setLb(Point lb)
    {
        this.lb = lb;
    }

    public Point getRb()
    {
        return rb;
    }

    public void setRb(Point rb)
    {
        this.rb = rb;
    }

    public static class Point
    {
        private int x;
        private int y;

        public int getX()
        {
            return x;
        }

        public void setX(int x)
        {
            this.x = x;
        }

        public int getY()
        {
            return y;
        }

        public void setY(int y)
        {
            this.y = y;
        }
    }
}
