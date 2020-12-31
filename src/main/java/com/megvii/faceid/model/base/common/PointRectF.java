package com.megvii.faceid.model.base.common;

public class PointRectF
{
    private PointF rt;
    private PointF lt;
    private PointF lb;
    private PointF rb;

    public PointF getRt()
    {
        return rt;
    }

    public void setRt(PointF rt)
    {
        this.rt = rt;
    }

    public PointF getLt()
    {
        return lt;
    }

    public void setLt(PointF lt)
    {
        this.lt = lt;
    }

    public PointF getLb()
    {
        return lb;
    }

    public void setLb(PointF lb)
    {
        this.lb = lb;
    }

    public PointF getRb()
    {
        return rb;
    }

    public void setRb(PointF rb)
    {
        this.rb = rb;
    }

    public static class PointF
    {
        private float x;
        private float y;

        public float getX()
        {
            return x;
        }

        public void setX(float x)
        {
            this.x = x;
        }

        public float getY()
        {
            return y;
        }

        public void setY(float y)
        {
            this.y = y;
        }
    }
}
