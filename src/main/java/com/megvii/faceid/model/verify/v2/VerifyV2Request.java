package com.megvii.faceid.model.verify.v2;

import com.megvii.faceid.model.base.sdk.VerifyKeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class VerifyV2Request extends VerifyKeyRequest
{
    private static final String FACE_IMAGE_TYPE_MEGLIVE = "meglive";
    private static final String FACE_IMAGE_TYPE_FACETOKEN = "facetoken";
    private static final String FACE_IMAGE_TYPE_RAW_IMAGE = "raw_image";
    private static final String FACE_IMAGE_TYPE_MEGLIVE_FLASH = "meglive_flash";

    private String faceImageType;
    private String failWhenRefMultipleFaces;
    private byte[] imageRef3;

    // region Meglive SDK
    private String delta;
    private byte[] imageBest;
    private byte[] imageEnv;
    private byte[] imageAction1;
    private byte[] imageAction2;
    private byte[] imageAction3;
    private byte[] imageAction4;
    private byte[] imageAction5;
    private String checkDelta;
    // endregion

    // region facetoken
    private String faceToken;
    // endregion

    // region raw_image
    private byte[] image;
    private String failWhenMultipleFaces;
    private String faceQualityThreshold;
    private String returnFaces;
    // endregion

    // region MegLiveFlash
    private byte[] megliveFlashResult;
    // endregion


    public String getFaceImageType()
    {
        return faceImageType;
    }

    public void setFaceImageType(String faceImageType)
    {
        this.faceImageType = faceImageType;
    }

    public String getFailWhenRefMultipleFaces()
    {
        return failWhenRefMultipleFaces;
    }

    public void setFailWhenRefMultipleFaces(String failWhenRefMultipleFaces)
    {
        this.failWhenRefMultipleFaces = failWhenRefMultipleFaces;
    }

    public byte[] getImageRef3()
    {
        return imageRef3;
    }

    public void setImageRef3(byte[] imageRef3)
    {
        this.imageRef3 = imageRef3;
    }

    public void setImageRef3(File imageRef3)
    {
        if (imageRef3 != null)
            setImageRef3(CommonUtils.getFileBytes(imageRef3));
    }

    public String getDelta()
    {
        return delta;
    }

    public void setDelta(String delta)
    {
        this.delta = delta;
    }

    public byte[] getImageBest()
    {
        return imageBest;
    }

    public void setImageBest(byte[] imageBest)
    {
        this.imageBest = imageBest;
    }

    public void setImageBest(File imageBest)
    {
        if (imageBest != null)
            setImageBest(CommonUtils.getFileBytes(imageBest));
    }

    public byte[] getImageEnv()
    {
        return imageEnv;
    }

    public void setImageEnv(byte[] imageEnv)
    {
        this.imageEnv = imageEnv;
    }

    public void setImageEnv(File imageEnv)
    {
        if (imageEnv != null)
            setImageEnv(CommonUtils.getFileBytes(imageEnv));
    }

    public byte[] getImageAction1()
    {
        return imageAction1;
    }

    public void setImageAction1(byte[] imageAction1)
    {
        this.imageAction1 = imageAction1;
    }

    public void setImageAction1(File imageAction1)
    {
        if (imageAction1 != null)
            setImageAction1(CommonUtils.getFileBytes(imageAction1));
    }

    public byte[] getImageAction2()
    {
        return imageAction2;
    }

    public void setImageAction2(byte[] imageAction2)
    {
        this.imageAction2 = imageAction2;
    }

    public void setImageAction2(File imageAction2)
    {
        if (imageAction2 != null)
            setImageAction2(CommonUtils.getFileBytes(imageAction2));
    }

    public byte[] getImageAction3()
    {
        return imageAction3;
    }

    public void setImageAction3(byte[] imageAction3)
    {
        this.imageAction3 = imageAction3;
    }

    public void setImageAction3(File imageAction3)
    {
        if (imageAction3 != null)
            setImageAction3(CommonUtils.getFileBytes(imageAction3));
    }

    public byte[] getImageAction4()
    {
        return imageAction4;
    }

    public void setImageAction4(byte[] imageAction4)
    {
        this.imageAction4 = imageAction4;
    }

    public void setImageAction4(File imageAction4)
    {
        if (imageAction4 != null)
            setImageAction4(CommonUtils.getFileBytes(imageAction4));
    }

    public byte[] getImageAction5()
    {
        return imageAction5;
    }

    public void setImageAction5(byte[] imageAction5)
    {
        this.imageAction5 = imageAction5;
    }

    public void setImageAction5(File imageAction5)
    {
        if (imageAction5 != null)
            setImageAction5(CommonUtils.getFileBytes(imageAction5));
    }

    public String getCheckDelta()
    {
        return checkDelta;
    }

    public void setCheckDelta(String checkDelta)
    {
        this.checkDelta = checkDelta;
    }

    public String getFaceToken()
    {
        return faceToken;
    }

    public void setFaceToken(String faceToken)
    {
        this.faceToken = faceToken;
    }

    public byte[] getImage()
    {
        return image;
    }

    public void setImage(byte[] image)
    {
        this.image = image;
    }

    public void setImage(File image)
    {
        if (image != null)
            setImage(CommonUtils.getFileBytes(image));
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

    public byte[] getMegliveFlashResult()
    {
        return megliveFlashResult;
    }

    public void setMegliveFlashResult(byte[] megliveFlashResult)
    {
        this.megliveFlashResult = megliveFlashResult;
    }

    public void setMegliveFlashResult(File megliveFlashResult)
    {
        if (megliveFlashResult != null)
            setMegliveFlashResult(CommonUtils.getFileBytes(megliveFlashResult));
    }

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/v2/verify";
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
        this.addStringParam(Const.API_PARAM_FACE_IMAGE_TYPE, faceImageType);
        if (!CommonUtils.isNullOrEmpty(failWhenRefMultipleFaces))
            this.addStringParam(Const.API_PARAM_FAIL_WHEN_REF_MULTIPLE_FACES, failWhenRefMultipleFaces);
        if (imageRef3 != null && imageRef3.length > 0)
            this.addBinaryParam(Const.API_PARAM_IMAGE_REF3, imageRef3);
        switch (faceImageType)
        {
            case FACE_IMAGE_TYPE_MEGLIVE:
            {
                this.addStringParam(Const.API_PARAM_DELTA, delta);
                this.addBinaryParam(Const.API_PARAM_IMAGE_BEST, imageBest);
                if (imageEnv != null && imageEnv.length > 0)
                    this.addBinaryParam(Const.API_PARAM_IMAGE_ENV, imageEnv);
                if (imageAction1 != null && imageAction1.length > 0)
                    this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION1, imageAction1);
                if (imageAction2 != null && imageAction2.length > 0)
                    this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION2, imageAction2);
                if (imageAction3 != null && imageAction3.length > 0)
                    this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION3, imageAction3);
                if (imageAction4 != null && imageAction4.length > 0)
                    this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION4, imageAction4);
                if (imageAction5 != null && imageAction5.length > 0)
                    this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION5, imageAction5);
                if (!CommonUtils.isNullOrEmpty(checkDelta))
                    this.addStringParam(Const.API_PARAM_CHECK_DELTA, checkDelta);
                break;
            }
            case FACE_IMAGE_TYPE_FACETOKEN:
            {
                if (!CommonUtils.isNullOrEmpty(faceToken))
                    this.addStringParam(Const.API_PARAM_FACE_TOKEN, faceToken);
                break;
            }
            case FACE_IMAGE_TYPE_RAW_IMAGE:
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
            case FACE_IMAGE_TYPE_MEGLIVE_FLASH:
            {
                this.addBinaryParam(Const.API_PARAM_MEGLIVE_FLASH_RESULT, megliveFlashResult);
                break;
            }
        }
    }
}
