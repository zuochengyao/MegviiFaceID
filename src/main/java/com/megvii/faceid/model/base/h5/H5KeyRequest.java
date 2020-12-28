package com.megvii.faceid.model.base.h5;

import com.megvii.faceid.model.base.sdk.VerifyKeyRequest;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

public abstract class H5KeyRequest extends VerifyKeyRequest
{
    private String returnUrl;
    private String notifyUrl;
    private String bizNo;
    private String bizExtraData;
    private String sceneId;

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

    @Override
    public void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_RETURN_URL, returnUrl);
        this.addStringParam(Const.API_PARAM_NOTIFY_URL, notifyUrl);
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
        if (!CommonUtils.isNullOrEmpty(bizExtraData))
            this.addStringParam(Const.API_PARAM_BIZ_EXTRA_DATA, bizExtraData);
        if (!CommonUtils.isNullOrEmpty(sceneId))
            this.addStringParam(Const.API_PARAM_SCENE_ID, sceneId);
    }
}
