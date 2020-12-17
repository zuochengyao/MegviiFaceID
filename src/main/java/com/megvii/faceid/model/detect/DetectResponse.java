package com.megvii.faceid.model.detect;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;

import java.util.List;

public class DetectResponse extends BaseResponse
{
    private List<Face> faces;

    public static class Face
    {
        public float quality;
        @SerializedName("quality_threshold")
        public float qualityThreshold;
        public Rect rect;
        public int orientation;
        public String token;

        public static class Rect
        {
            public float left;
            public float top;
            public float width;
            public float height;
        }
    }
}
