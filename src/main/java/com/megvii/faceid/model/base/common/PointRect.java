package com.megvii.faceid.model.base.common;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public class PointRect
{
    @SerializedName(value = Const.API_PARAM_LT, alternate = Const.API_PARAM_LEFT_TOP)
    private Point lt;
    @SerializedName(value = Const.API_PARAM_LB, alternate = Const.API_PARAM_LEFT_BOTTOM)
    private Point lb;
    @SerializedName(value = Const.API_PARAM_RB, alternate = Const.API_PARAM_RIGHT_BOTTOM)
    private Point rb;
    @SerializedName(value = Const.API_PARAM_RT, alternate = Const.API_PARAM_RIGHT_TOP)
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
