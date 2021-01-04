package com.megvii.faceid.model.verify.v2;

import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.CompareRequest;
import com.megvii.faceid.http.base.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class VerifyV2Request extends CompareRequest implements IKeyRequest
{
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
        this.addStringParam(Const.API_PARAM_FACE_IMAGE_TYPE, faceImageType);
    }

    public String getFailWhenRefMultipleFaces()
    {
        return failWhenRefMultipleFaces;
    }

    public void setFailWhenRefMultipleFaces(String failWhenRefMultipleFaces)
    {
        this.failWhenRefMultipleFaces = failWhenRefMultipleFaces;
        this.addStringParam(Const.API_PARAM_FAIL_WHEN_REF_MULTIPLE_FACES, failWhenRefMultipleFaces);
    }

    public byte[] getImageRef3()
    {
        return imageRef3;
    }

    public void setImageRef3(byte[] imageRef3)
    {
        this.imageRef3 = imageRef3;
        this.addBinaryParam(Const.API_PARAM_IMAGE_REF3, imageRef3);
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
        this.addStringParam(Const.API_PARAM_DELTA, delta);
    }

    public byte[] getImageBest()
    {
        return imageBest;
    }

    public void setImageBest(byte[] imageBest)
    {
        this.imageBest = imageBest;
        this.addBinaryParam(Const.API_PARAM_IMAGE_BEST, imageBest);
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
        this.addBinaryParam(Const.API_PARAM_IMAGE_ENV, imageEnv);
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
        this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION1, imageAction1);
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
        this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION2, imageAction2);
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
        this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION3, imageAction3);
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
        this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION4, imageAction4);
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
        this.addBinaryParam(Const.API_PARAM_IMAGE_ACTION5, imageAction5);
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
        this.addStringParam(Const.API_PARAM_CHECK_DELTA, checkDelta);
    }

    public String getFaceToken()
    {
        return faceToken;
    }

    public void setFaceToken(String faceToken)
    {
        this.faceToken = faceToken;
        this.addStringParam(Const.API_PARAM_FACE_TOKEN, faceToken);
    }

    public byte[] getImage()
    {
        return image;
    }

    public void setImage(byte[] image)
    {
        this.image = image;
        this.addBinaryParam(Const.API_PARAM_IMAGE, image);
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

    public byte[] getMegliveFlashResult()
    {
        return megliveFlashResult;
    }

    public void setMegliveFlashResult(byte[] megliveFlashResult)
    {
        this.megliveFlashResult = megliveFlashResult;
        this.addBinaryParam(Const.API_PARAM_MEGLIVE_FLASH_RESULT, megliveFlashResult);
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
    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
    }

    @Override
    public void setApiSecret(String apiSecret)
    {
        this.apiSecret = apiSecret;
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }
}
