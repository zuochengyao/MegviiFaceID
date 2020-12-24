package com.megvii.faceid.model.detect;

import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.model.common.FaceInfo;

import java.util.List;

public class DetectResponse extends BaseResponse
{
    private List<DetectFaceInfo> faces;

    public List<DetectFaceInfo> getFaces()
    {
        return faces;
    }

    public void setFaces(List<DetectFaceInfo> faces)
    {
        this.faces = faces;
    }

    public static class DetectFaceInfo extends FaceInfo
    {
        private String token;

        public String getToken()
        {
            return token;
        }

        public void setToken(String token)
        {
            this.token = token;
        }
    }
}
