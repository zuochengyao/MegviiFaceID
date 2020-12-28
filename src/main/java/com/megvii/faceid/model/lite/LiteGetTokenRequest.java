package com.megvii.faceid.model.lite;

import com.megvii.faceid.model.base.h5.H5KeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.Const;

public class LiteGetTokenRequest extends H5KeyRequest
{
    private String webTitle;
    private String procedureType;
    private String livenessPreferences;
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
}
