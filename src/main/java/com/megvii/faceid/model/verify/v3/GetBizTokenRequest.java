package com.megvii.faceid.model.verify.v3;

import com.megvii.faceid.model.base.sdk.VerifySignRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class GetBizTokenRequest extends VerifySignRequest
{
    private String livenessType;
    private String bizNo;
    private String livenessTimeout;
    private String livenessActionCount;
    private String faceReplaceDetection;
    private String eyesCloseDetection;
    private String flashLivenessTimeout;
    private byte[] image;
    private String failWhenMultipleFaces;
    private String faceQualityThreshold;
    private String returnFaces;
    private String verbose;
    private String securityLevel;
    private String forceCompare;
    private String livenessLevel;
    private String maximumBrightness;

    public String getLivenessType()
    {
        return livenessType;
    }

    public void setLivenessType(String livenessType)
    {
        this.livenessType = livenessType;
        this.addStringParam(Const.API_PARAM_LIVENESS_TYPE, livenessType);
    }

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
    }

    public String getLivenessTimeout()
    {
        return livenessTimeout;
    }

    public void setLivenessTimeout(String livenessTimeout)
    {
        this.livenessTimeout = livenessTimeout;
        this.addStringParam(Const.API_PARAM_LIVENESS_TIMEOUT, livenessTimeout);
    }

    public String getLivenessActionCount()
    {
        return livenessActionCount;
    }

    public void setLivenessActionCount(String livenessActionCount)
    {
        this.livenessActionCount = livenessActionCount;
        this.addStringParam(Const.API_PARAM_LIVENESS_ACTION_COUNT, livenessActionCount);
    }

    public String getFaceReplaceDetection()
    {
        return faceReplaceDetection;
    }

    public void setFaceReplaceDetection(String faceReplaceDetection)
    {
        this.faceReplaceDetection = faceReplaceDetection;
        this.addStringParam(Const.API_PARAM_FACE_REPLACE_DETECTION, faceReplaceDetection);
    }

    public String getEyesCloseDetection()
    {
        return eyesCloseDetection;
    }

    public void setEyesCloseDetection(String eyesCloseDetection)
    {
        this.eyesCloseDetection = eyesCloseDetection;
        this.addStringParam(Const.API_PARAM_EYES_CLOSE_DETECTION, eyesCloseDetection);
    }

    public String getFlashLivenessTimeout()
    {
        return flashLivenessTimeout;
    }

    public void setFlashLivenessTimeout(String flashLivenessTimeout)
    {
        this.flashLivenessTimeout = flashLivenessTimeout;
        this.addStringParam(Const.API_PARAM_FLASH_LIVENESS_TIMEOUT, flashLivenessTimeout);
    }

    public byte[] getImage()
    {
        return image;
    }

    public void setImage(File image)
    {
        if (image != null)
            setImage(CommonUtils.getFileBytes(image));
    }

    public void setImage(byte[] image)
    {
        this.image = image;
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
    }

    public String getFailWhenMultipleFaces()
    {
        return failWhenMultipleFaces;
    }

    public void setFailWhenMultipleFaces(String failWhenMultipleFaces)
    {
        this.failWhenMultipleFaces = failWhenMultipleFaces;
        this.addStringParam(Const.API_PARAM_FAIL_WHEN_MULTIPLE_FACES, failWhenMultipleFaces);
    }

    public String getFaceQualityThreshold()
    {
        return faceQualityThreshold;
    }

    public void setFaceQualityThreshold(String faceQualityThreshold)
    {
        this.faceQualityThreshold = faceQualityThreshold;
        this.addStringParam(Const.API_PARAM_FACE_QUALITY_THRESHOLD, faceQualityThreshold);
    }

    public String getReturnFaces()
    {
        return returnFaces;
    }

    public void setReturnFaces(String returnFaces)
    {
        this.returnFaces = returnFaces;
        this.addStringParam(Const.API_PARAM_RETURN_FACES, returnFaces);
    }

    public String getVerbose()
    {
        return verbose;
    }

    public void setVerbose(String verbose)
    {
        this.verbose = verbose;
        this.addStringParam(Const.API_PARAM_VERBOSE, verbose);
    }

    public String getSecurityLevel()
    {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel)
    {
        this.securityLevel = securityLevel;
        this.addStringParam(Const.API_PARAM_SECURITY_LEVEL, securityLevel);
    }

    public String getForceCompare()
    {
        return forceCompare;
    }

    public void setForceCompare(String forceCompare)
    {
        this.forceCompare = forceCompare;
        this.addStringParam(Const.API_PARAM_FORCE_COMPARE, forceCompare);
    }

    public String getLivenessLevel()
    {
        return livenessLevel;
    }

    public void setLivenessLevel(String livenessLevel)
    {
        this.livenessLevel = livenessLevel;
        this.addStringParam(Const.API_PARAM_LIVENESS_LEVEL, livenessLevel);
    }

    public String getMaximumBrightness()
    {
        return maximumBrightness;
    }

    public void setMaximumBrightness(String maximumBrightness)
    {
        this.maximumBrightness = maximumBrightness;
        this.addStringParam(Const.API_PARAM_MAXIMUM_BRIGHTNESS, maximumBrightness);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/v3/sdk/get_biz_token";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
