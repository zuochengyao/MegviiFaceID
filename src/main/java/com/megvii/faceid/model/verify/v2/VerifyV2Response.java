package com.megvii.faceid.model.verify.v2;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.model.common.FaceInfo;
import com.megvii.faceid.model.common.Result;

import java.util.List;

public class VerifyV2Response extends BaseResponse
{
    @SerializedName("result_faceid")
    private Result resultFaceId;
    @SerializedName("result_ref1")
    private Result resultRef1;
    @SerializedName("result_ref2")
    private Result resultRef2;
    @SerializedName("result_ref3")
    private Result resultRef3;
    @SerializedName("id_exceptions")
    private IdExceptions idExceptions;
    private List<FaceInfo> faces;
    @SerializedName("face_genuineness")
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

    public static class IdExceptions
    {
        @SerializedName("id_attacked")
        private int idAttacked;
        @SerializedName("id_photo_monochrome")
        private int idPhotoMonochrome;

        public int getIdAttacked()
        {
            return idAttacked;
        }

        public void setIdAttacked(int idAttacked)
        {
            this.idAttacked = idAttacked;
        }

        public int getIdPhotoMonochrome()
        {
            return idPhotoMonochrome;
        }

        public void setIdPhotoMonochrome(int idPhotoMonochrome)
        {
            this.idPhotoMonochrome = idPhotoMonochrome;
        }
    }

    public static class FaceGenuineness
    {
        @SerializedName("synthetic_face_confidence")
        private float syntheticFaceConfidence;
        @SerializedName("synthetic_face_threshold")
        private float syntheticFaceThreshold;
        @SerializedName("mask_confidence")
        private float maskConfidence;
        @SerializedName("mask_threshold")
        private float maskThreshold;
        @SerializedName("screen_replay_confidence")
        private float screenReplayConfidence;
        @SerializedName("screen_replay_threshold")
        private float screenReplayThreshold;
        @SerializedName("face_replaced")
        private int faceReplaced;

        public float getSyntheticFaceConfidence()
        {
            return syntheticFaceConfidence;
        }

        public void setSyntheticFaceConfidence(float syntheticFaceConfidence)
        {
            this.syntheticFaceConfidence = syntheticFaceConfidence;
        }

        public float getSyntheticFaceThreshold()
        {
            return syntheticFaceThreshold;
        }

        public void setSyntheticFaceThreshold(float syntheticFaceThreshold)
        {
            this.syntheticFaceThreshold = syntheticFaceThreshold;
        }

        public float getMaskConfidence()
        {
            return maskConfidence;
        }

        public void setMaskConfidence(float maskConfidence)
        {
            this.maskConfidence = maskConfidence;
        }

        public float getMaskThreshold()
        {
            return maskThreshold;
        }

        public void setMaskThreshold(float maskThreshold)
        {
            this.maskThreshold = maskThreshold;
        }

        public float getScreenReplayConfidence()
        {
            return screenReplayConfidence;
        }

        public void setScreenReplayConfidence(float screenReplayConfidence)
        {
            this.screenReplayConfidence = screenReplayConfidence;
        }

        public float getScreenReplayThreshold()
        {
            return screenReplayThreshold;
        }

        public void setScreenReplayThreshold(float screenReplayThreshold)
        {
            this.screenReplayThreshold = screenReplayThreshold;
        }

        public int getFaceReplaced()
        {
            return faceReplaced;
        }

        public void setFaceReplaced(int faceReplaced)
        {
            this.faceReplaced = faceReplaced;
        }
    }
}
