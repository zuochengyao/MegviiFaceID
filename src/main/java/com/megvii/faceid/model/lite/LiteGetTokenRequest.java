package com.megvii.faceid.model.lite;

import com.megvii.faceid.model.base.request.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.H5Request;
import com.megvii.faceid.http.base.HttpMethod;
import com.megvii.faceid.util.Const;

public class LiteGetTokenRequest extends H5Request implements IKeyRequest
{
    private String webTitle;
    private String procedureType;
    private String livenessPreferences;
    private String getShootingError;
    private int maximumShootingTime;
    private String idcardMode;
    private String idcardUnEditableField;
    private String fmpMode;

    public String getWebTitle()
    {
        return webTitle;
    }

    public void setWebTitle(String webTitle)
    {
        this.webTitle = webTitle;
        this.addStringParam(Const.API_PARAM_WEB_TITLE, webTitle);
    }

    public String getProcedureType()
    {
        return procedureType;
    }

    public void setProcedureType(String procedureType)
    {
        this.procedureType = procedureType;
        this.addStringParam(Const.API_PARAM_PROCEDURE_TYPE, procedureType);
    }

    public String getLivenessPreferences()
    {
        return livenessPreferences;
    }

    public void setLivenessPreferences(String livenessPreferences)
    {
        this.livenessPreferences = livenessPreferences;
        this.addStringParam(Const.API_PARAM_LIVENESS_PREFERENCES, livenessPreferences);
    }

    public String getGetShootingError()
    {
        return getShootingError;
    }

    public void setGetShootingError(String getShootingError)
    {
        this.getShootingError = getShootingError;
        this.addStringParam(Const.API_PARAM_GET_SHOOTING_ERROR, getShootingError);
    }

    public int getMaximumShootingTime()
    {
        return maximumShootingTime;
    }

    public void setMaximumShootingTime(int maximumShootingTime)
    {
        this.maximumShootingTime = maximumShootingTime;
        this.addStringParam(Const.API_PARAM_MAXIMUM_SHOOTING_TIME, maximumShootingTime);
    }

    public String getIdcardMode()
    {
        return idcardMode;
    }

    public void setIdcardMode(String idcardMode)
    {
        this.idcardMode = idcardMode;
        this.addStringParam(Const.API_PARAM_IDCARD_MODE, idcardMode);
    }

    public String getIdcardUnEditableField()
    {
        return idcardUnEditableField;
    }

    public void setIdcardUnEditableField(String idcardUnEditableField)
    {
        this.idcardUnEditableField = idcardUnEditableField;
        this.addStringParam(Const.API_PARAM_IDCARD_UNEDITABLE_FIELD, idcardUnEditableField);
    }

    public String getFmpMode()
    {
        return fmpMode;
    }

    public void setFmpMode(String fmpMode)
    {
        this.fmpMode = fmpMode;
        this.addStringParam(Const.API_PARAM_FMP_MODE, livenessPreferences);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/get_token";
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
