package com.megvii.faceid.model.lite;

import com.megvii.faceid.model.base.h5.H5KeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
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
    }

    public String getProcedureType()
    {
        return procedureType;
    }

    public void setProcedureType(String procedureType)
    {
        this.procedureType = procedureType;
    }

    public String getLivenessPreferences()
    {
        return livenessPreferences;
    }

    public void setLivenessPreferences(String livenessPreferences)
    {
        this.livenessPreferences = livenessPreferences;
    }

    public String getIdcardMode()
    {
        return idcardMode;
    }

    public void setIdcardMode(String idcardMode)
    {
        this.idcardMode = idcardMode;
    }

    public String getIdcardUnEditableField()
    {
        return idcardUnEditableField;
    }

    public void setIdcardUnEditableField(String idcardUnEditableField)
    {
        this.idcardUnEditableField = idcardUnEditableField;
    }

    public String getFmpMode()
    {
        return fmpMode;
    }

    public void setFmpMode(String fmpMode)
    {
        this.fmpMode = fmpMode;
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
    public void toMap()
    {
        super.toMap();
        if (!CommonUtils.isNullOrEmpty(webTitle))
            this.addStringParam(Const.API_PARAM_WEB_TITLE, webTitle);
        if (!CommonUtils.isNullOrEmpty(procedureType))
            this.addStringParam(Const.API_PARAM_PROCEDURE_TYPE, procedureType);
        if (!CommonUtils.isNullOrEmpty(livenessPreferences))
            this.addStringParam(Const.API_PARAM_LIVENESS_PREFERENCES, livenessPreferences);
        if (COMPARISON_TYPE_KYC.equals(comparisonType))
        {
            this.addStringParam(Const.API_PARAM_IDCARD_MODE, idcardMode);
            if (!CommonUtils.isNullOrEmpty(idcardUnEditableField))
                this.addStringParam(Const.API_PARAM_IDCARD_UNEDITABLE_FIELD, idcardUnEditableField);
        }
        if (!CommonUtils.isNullOrEmpty(fmpMode))
            this.addStringParam(Const.API_PARAM_FMP_MODE, livenessPreferences);
    }
}
