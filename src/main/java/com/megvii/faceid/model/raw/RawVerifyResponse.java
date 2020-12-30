package com.megvii.faceid.model.raw;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.CompareResponse;
import com.megvii.faceid.util.Const;

public class RawVerifyResponse extends CompareResponse
{
    @SerializedName(Const.API_PARAM_BIZ_NO)
    private String bizNo;
    private Liveness liveness;

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
    }

    public Liveness getLiveness()
    {
        return liveness;
    }

    public void setLiveness(Liveness liveness)
    {
        this.liveness = liveness;
    }

    public static class Liveness
    {
        @SerializedName(Const.API_PARAM_PROCEDURE_VALIDATION)
        private String procedureValidation;
        @SerializedName(Const.API_PARAM_FACE_GENUINENESS)
        private String faceGenuineness;

        public String getProcedureValidation()
        {
            return procedureValidation;
        }

        public void setProcedureValidation(String procedureValidation)
        {
            this.procedureValidation = procedureValidation;
        }

        public String getFaceGenuineness()
        {
            return faceGenuineness;
        }

        public void setFaceGenuineness(String faceGenuineness)
        {
            this.faceGenuineness = faceGenuineness;
        }
    }
}
