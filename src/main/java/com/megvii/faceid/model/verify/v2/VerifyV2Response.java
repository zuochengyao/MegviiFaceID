package com.megvii.faceid.model.verify.v2;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.model.common.FaceGenuineness;
import com.megvii.faceid.model.common.FaceInfo;
import com.megvii.faceid.model.common.IdExceptions;
import com.megvii.faceid.model.common.Result;
import com.megvii.faceid.util.Const;

import java.util.List;

public class VerifyV2Response extends BaseResponse
{
    @SerializedName(Const.API_PARAM_RESULT_FACEID)
    private Result resultFaceId;
    @SerializedName(Const.API_PARAM_RESULT_REF1)
    private Result resultRef1;
    @SerializedName(Const.API_PARAM_RESULT_REF2)
    private Result resultRef2;
    @SerializedName(Const.API_PARAM_RESULT_REF3)
    private Result resultRef3;
    @SerializedName(Const.API_PARAM_ID_EXCEPTIONS)
    private IdExceptions idExceptions;
    private List<FaceInfo> faces;
    @SerializedName(Const.API_PARAM_FACE_GENUINENESS)
    private FaceGenuineness faceGenuineness;

    public Result getResultFaceId()
    {
        return resultFaceId;
    }

    public void setResultFaceId(Result resultFaceId)
    {
        this.resultFaceId = resultFaceId;
    }

    public Result getResultRef1()
    {
        return resultRef1;
    }

    public void setResultRef1(Result resultRef1)
    {
        this.resultRef1 = resultRef1;
    }

    public Result getResultRef2()
    {
        return resultRef2;
    }

    public void setResultRef2(Result resultRef2)
    {
        this.resultRef2 = resultRef2;
    }

    public Result getResultRef3()
    {
        return resultRef3;
    }

    public void setResultRef3(Result resultRef3)
    {
        this.resultRef3 = resultRef3;
    }

    public IdExceptions getIdExceptions()
    {
        return idExceptions;
    }

    public void setIdExceptions(IdExceptions idExceptions)
    {
        this.idExceptions = idExceptions;
    }

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
