package com.megvii.faceid.model.pc;

import com.megvii.faceid.model.base.verify.CompareKeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class PcGetTokenRequest extends CompareKeyRequest
{
    private byte[] imageRef3;
    private String returnUrl;
    private String notifyUrl;
    private String bizNo;
    private String bizExtraData;
    private String sceneId;
    private String screenReplay;

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

    public String getReturnUrl()
    {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl)
    {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl()
    {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl)
    {
        this.notifyUrl = notifyUrl;
    }

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public String getBizExtraData()
    {
        return bizExtraData;
    }

    public void setBizExtraData(String bizExtraData)
    {
        this.bizExtraData = bizExtraData;
    }

    public String getSceneId()
    {
        return sceneId;
    }

    public void setSceneId(String sceneId)
    {
        this.sceneId = sceneId;
    }

    public String getScreenReplay()
    {
        return screenReplay;
    }

    public void setScreenReplay(String screenReplay)
    {
        this.screenReplay = screenReplay;
    }

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/liveness/v2/get_token";
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
        if (imageRef3 != null && imageRef3.length > 0)
            this.addBinaryParam(Const.API_PARAM_IMAGE_REF3, imageRef3);
        this.addStringParam(Const.API_PARAM_RETURN_URL, returnUrl);
        this.addStringParam(Const.API_PARAM_NOTIFY_URL, notifyUrl);
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
        if (!CommonUtils.isNullOrEmpty(bizExtraData))
            this.addStringParam(Const.API_PARAM_BIZ_EXTRA_DATA, bizExtraData);
        if (!CommonUtils.isNullOrEmpty(sceneId))
            this.addStringParam(Const.API_PARAM_SCENE_ID, sceneId);
        if (!CommonUtils.isNullOrEmpty(screenReplay))
            this.addStringParam(Const.API_PARAM_SCREEN_REPLAY, screenReplay);
    }
}
