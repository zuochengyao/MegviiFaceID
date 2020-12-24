package com.megvii.faceid.model.detect;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;

import java.util.List;

public class DetectResponse extends BaseResponse
{
    private List<Face> faces;

    public List<Face> getFaces()
    {
        return faces;
    }

    public void setFaces(List<Face> faces)
    {
        this.faces = faces;
    }

    public static class Face
    {
        private float quality;
        @SerializedName("quality_threshold")
        private float qualityThreshold;
        private Rect rect;
        private int orientation;
        private String token;

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

        public Rect getRect()
        {
            return rect;
        }

        public void setRect(Rect rect)
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

        public String getToken()
        {
            return token;
        }

        public void setToken(String token)
        {
            this.token = token;
        }

        public static class Rect
        {
            private float left;
            private float top;
            private float width;
            private float height;

            public float getLeft()
            {
                return left;
            }

            public void setLeft(float left)
            {
                this.left = left;
            }

            public float getTop()
            {
                return top;
            }

            public void setTop(float top)
            {
                this.top = top;
            }

            public float getWidth()
            {
                return width;
            }

            public void setWidth(float width)
            {
                this.width = width;
            }

            public float getHeight()
            {
                return height;
            }

            public void setHeight(float height)
            {
                this.height = height;
            }
        }
    }
}
