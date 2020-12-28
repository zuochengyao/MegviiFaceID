package com.megvii.faceid.model.base.request;

import com.megvii.faceid.util.Const;

public abstract class H5Request extends ComparisonRequest
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
        this.addStringParam(Const.API_PARAM_RETURN_URL, returnUrl);
    }

    public String getNotifyUrl()
    {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl)
    {
        this.notifyUrl = notifyUrl;
        this.addStringParam(Const.API_PARAM_NOTIFY_URL, notifyUrl);
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

    public String getBizExtraData()
    {
        return bizExtraData;
    }

    public void setBizExtraData(String bizExtraData)
    {
        this.bizExtraData = bizExtraData;
        this.addStringParam(Const.API_PARAM_BIZ_EXTRA_DATA, bizExtraData);
    }

    public String getSceneId()
    {
        return sceneId;
    }

    public void setSceneId(String sceneId)
    {
        this.sceneId = sceneId;
        this.addStringParam(Const.API_PARAM_SCENE_ID, sceneId);
    }


}
