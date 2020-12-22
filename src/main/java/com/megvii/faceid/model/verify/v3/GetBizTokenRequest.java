package com.megvii.faceid.model.verify.v3;

import com.megvii.faceid.model.base.request.ApiSignRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class GetBizTokenRequest extends ApiSignRequest
{
    private static final String LIVENESS_TYPE_MEGLIVE = "meglive";
    private static final String LIVENESS_TYPE_STILL = "still";
    private static final String LIVENESS_TYPE_FLASH = "flash";
    private static final String LIVENESS_TYPE_RAW_IMAGE = "raw_image";

    private static final String COMPARISON_TYPE_COMPARE = "0";
    private static final String COMPARISON_TYPE_KYC = "1";


    private String livenessType;
    private String comparisonType;
    private String idcardName;
    private String idcardNumber;
    private String uuid;
    private byte[] imageRef1;
    private byte[] imageRef2;
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
    private String multiOrientedDetection;
    private String livenessLevel;
    private String maximumBrightness;

    public String getLivenessType()
    {
        return livenessType;
    }

    public void setLivenessType(String livenessType)
    {
        this.livenessType = livenessType;
    }

    public String getComparisonType()
    {
        return comparisonType;
    }

    public void setComparisonType(String comparisonType)
    {
        this.comparisonType = comparisonType;
    }

    public String getIdcardName()
    {
        return idcardName;
    }

    public void setIdcardName(String idcardName)
    {
        this.idcardName = idcardName;
    }

    public String getIdcardNumber()
    {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber)
    {
        this.idcardNumber = idcardNumber;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public byte[] getImageRef1()
    {
        return imageRef1;
    }

    public void setImageRef1(File imageRef1)
    {
        if (imageRef1 != null)
            setImageRef1(CommonUtils.getFileBytes(imageRef1));
    }

    public void setImageRef1(byte[] imageRef1)
    {
        this.imageRef1 = imageRef1;
    }

    public byte[] getImageRef2()
    {
        return imageRef2;
    }

    public void setImageRef2(File imageRef2)
    {
        if (imageRef2 != null)
            setImageRef2(CommonUtils.getFileBytes(imageRef2));
    }

    public void setImageRef2(byte[] imageRef2)
    {
        this.imageRef2 = imageRef2;
    }

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public String getLivenessTimeout()
    {
        return livenessTimeout;
    }

    public void setLivenessTimeout(String livenessTimeout)
    {
        this.livenessTimeout = livenessTimeout;
    }

    public String getLivenessActionCount()
    {
        return livenessActionCount;
    }

    public void setLivenessActionCount(String livenessActionCount)
    {
        this.livenessActionCount = livenessActionCount;
    }

    public String getFaceReplaceDetection()
    {
        return faceReplaceDetection;
    }

    public void setFaceReplaceDetection(String faceReplaceDetection)
    {
        this.faceReplaceDetection = faceReplaceDetection;
    }

    public String getEyesCloseDetection()
    {
        return eyesCloseDetection;
    }

    public void setEyesCloseDetection(String eyesCloseDetection)
    {
        this.eyesCloseDetection = eyesCloseDetection;
    }

    public String getFlashLivenessTimeout()
    {
        return flashLivenessTimeout;
    }

    public void setFlashLivenessTimeout(String flashLivenessTimeout)
    {
        this.flashLivenessTimeout = flashLivenessTimeout;
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
    }

    public String getFailWhenMultipleFaces()
    {
        return failWhenMultipleFaces;
    }

    public void setFailWhenMultipleFaces(String failWhenMultipleFaces)
    {
        this.failWhenMultipleFaces = failWhenMultipleFaces;
    }

    public String getFaceQualityThreshold()
    {
        return faceQualityThreshold;
    }

    public void setFaceQualityThreshold(String faceQualityThreshold)
    {
        this.faceQualityThreshold = faceQualityThreshold;
    }

    public String getReturnFaces()
    {
        return returnFaces;
    }

    public void setReturnFaces(String returnFaces)
    {
        this.returnFaces = returnFaces;
    }

    public String getVerbose()
    {
        return verbose;
    }

    public void setVerbose(String verbose)
    {
        this.verbose = verbose;
    }

    public String getSecurityLevel()
    {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel)
    {
        this.securityLevel = securityLevel;
    }

    public String getForceCompare()
    {
        return forceCompare;
    }

    public void setForceCompare(String forceCompare)
    {
        this.forceCompare = forceCompare;
    }

    public String getMultiOrientedDetection()
    {
        return multiOrientedDetection;
    }

    public void setMultiOrientedDetection(String multiOrientedDetection)
    {
        this.multiOrientedDetection = multiOrientedDetection;
    }

    public String getLivenessLevel()
    {
        return livenessLevel;
    }

    public void setLivenessLevel(String livenessLevel)
    {
        this.livenessLevel = livenessLevel;
    }

    public String getMaximumBrightness()
    {
        return maximumBrightness;
    }

    public void setMaximumBrightness(String maximumBrightness)
    {
        this.maximumBrightness = maximumBrightness;
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

    @Override
    public void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_LIVENESS_TYPE, livenessType);
        switch (livenessType)
        {
            case LIVENESS_TYPE_MEGLIVE:
            {
                if (!CommonUtils.isNullOrEmpty(livenessActionCount))
                    this.addStringParam(Const.API_PARAM_LIVENESS_ACTION_COUNT, livenessActionCount);
                if (!CommonUtils.isNullOrEmpty(faceReplaceDetection))
                    this.addStringParam(Const.API_PARAM_FACE_REPLACE_DETECTION, faceReplaceDetection);
                break;
            }
            case LIVENESS_TYPE_STILL:
            {
                if (!CommonUtils.isNullOrEmpty(eyesCloseDetection))
                    this.addStringParam(Const.API_PARAM_EYES_CLOSE_DETECTION, eyesCloseDetection);
                break;
            }
            case LIVENESS_TYPE_FLASH:
            {
                if (!CommonUtils.isNullOrEmpty(flashLivenessTimeout))
                    this.addStringParam(Const.API_PARAM_FLASH_LIVENESS_TIMEOUT, flashLivenessTimeout);
                break;
            }
            case LIVENESS_TYPE_RAW_IMAGE:
            {
                this.addBinaryParam(Const.API_PARAM_IMAGE, image);
                if (!CommonUtils.isNullOrEmpty(failWhenMultipleFaces))
                    this.addStringParam(Const.API_PARAM_FAIL_WHEN_MULTIPLE_FACES, failWhenMultipleFaces);
                if (!CommonUtils.isNullOrEmpty(faceQualityThreshold))
                    this.addStringParam(Const.API_PARAM_FACE_QUALITY_THRESHOLD, faceQualityThreshold);
                if (!CommonUtils.isNullOrEmpty(returnFaces))
                    this.addStringParam(Const.API_PARAM_RETURN_FACES, returnFaces);
                break;
            }
        }
        this.addStringParam(Const.API_PARAM_COMPARISON_TYPE, comparisonType);
        if (COMPARISON_TYPE_KYC.equals(comparisonType))
        {
            this.addStringParam(Const.API_PARAM_IDCARD_NAME, idcardName);
            this.addStringParam(Const.API_PARAM_IDCARD_NUMBER, idcardNumber);
            if (imageRef1 != null && imageRef1.length > 0)
                this.addBinaryParam(Const.API_PARAM_IMAGE_REF1, imageRef1);
            if (imageRef2 != null && imageRef2.length > 0)
                this.addBinaryParam(Const.API_PARAM_IMAGE_REF2, imageRef2);
        }
        else if (COMPARISON_TYPE_COMPARE.equals(comparisonType))
        {
            this.addStringParam(Const.API_PARAM_UUID, uuid);
            this.addBinaryParam(Const.API_PARAM_IMAGE_REF1, imageRef1);
            if (imageRef2 != null && imageRef2.length > 0)
                this.addBinaryParam(Const.API_PARAM_IMAGE_REF2, imageRef2);
        }
        if (!CommonUtils.isNullOrEmpty(bizNo))
            this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
        if (!CommonUtils.isNullOrEmpty(livenessTimeout))
            this.addStringParam(Const.API_PARAM_LIVENESS_TIMEOUT, livenessTimeout);
        if (!CommonUtils.isNullOrEmpty(verbose))
            this.addStringParam(Const.API_PARAM_VERBOSE, verbose);
        if (!CommonUtils.isNullOrEmpty(securityLevel))
            this.addStringParam(Const.API_PARAM_SECURITY_LEVEL, securityLevel);
        if (!CommonUtils.isNullOrEmpty(forceCompare))
            this.addStringParam(Const.API_PARAM_FORCE_COMPARE, forceCompare);
        if (!CommonUtils.isNullOrEmpty(multiOrientedDetection))
            this.addStringParam(Const.API_PARAM_MULTI_ORIENTED_DETECTION, multiOrientedDetection);
        if (!CommonUtils.isNullOrEmpty(livenessLevel))
            this.addStringParam(Const.API_PARAM_LIVENESS_LEVEL, livenessLevel);
        if (!CommonUtils.isNullOrEmpty(maximumBrightness))
            this.addStringParam(Const.API_PARAM_MAXIMUM_BRIGHTNESS, maximumBrightness);
    }
}