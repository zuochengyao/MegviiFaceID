package com.megvii.faceid.model.common;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public class FaceGenuineness
{
    @SerializedName(Const.API_PARAM_SYNTHETIC_FACE_CONFIDENCE)
    private float syntheticFaceConfidence;
    @SerializedName(Const.API_PARAM_SYNTHETIC_FACE_THRESHOLD)
    private float syntheticFaceThreshold;
    @SerializedName(Const.API_PARAM_MASK_CONFIDENCE)
    private float maskConfidence;
    @SerializedName(Const.API_PARAM_MASK_THRESHOLD)
    private float maskThreshold;
    @SerializedName(Const.API_PARAM_SCREEN_REPLAY_CONFIDENCE)
    private float screenReplayConfidence;
    @SerializedName(Const.API_PARAM_SCREEN_REPLAY_THRESHOLD)
    private float screenReplayThreshold;
    @SerializedName(Const.API_PARAM_FACE_REPLACED)
    private Integer faceReplaced;

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
