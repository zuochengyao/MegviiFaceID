package com.megvii.faceid.model.verify.v2;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.CompareResponse;
import com.megvii.faceid.model.common.FaceGenuineness;
import com.megvii.faceid.model.common.FaceInfo;
import com.megvii.faceid.util.Const;

import java.util.List;

public class VerifyV2Response extends CompareResponse
{
    private List<FaceInfo> faces;
    @SerializedName(Const.API_PARAM_FACE_GENUINENESS)
    private FaceGenuineness faceGenuineness;

    public List<FaceInfo> getFaces()
    {
        return faces;
    }

    public void setFaces(List<FaceInfo> faces)
    {
        this.faces = faces;
    }

    public FaceGenuineness getFaceGenuineness()
    {
        return faceGenuineness;
    }

    public void setFaceGenuineness(FaceGenuineness faceGenuineness)
    {
        this.faceGenuineness = faceGenuineness;
    }
}
