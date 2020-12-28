package com.megvii.faceid.model.ocr.idcard.v1;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.model.common.Legality;
import com.megvii.faceid.model.common.PointRectF;
import com.megvii.faceid.util.Const;

public class IdCardV1Response extends BaseResponse
{
    private String address;
    private Birthday birthday;
    private String gender;
    @SerializedName(Const.API_PARAM_ID_CARD_NUMBER)
    private String idcardNumber;
    private String name;
    private String race;
    private String side;
    @SerializedName(Const.API_PARAM_ISSUED_BY)
    private String issuedBy;
    @SerializedName(Const.API_PARAM_VALID_DATE)
    private String validDate;
    private Legality legality;
    @SerializedName(Const.API_PARAM_HEAD_RECT)
    private PointRectF headRect;

    public static class Birthday
    {
        private String year;
        private String month;
        private String day;

        public String getYear()
        {
            return year;
        }

        public void setYear(String year)
        {
            this.year = year;
        }

        public String getMonth()
        {
            return month;
        }

        public void setMonth(String month)
        {
            this.month = month;
        }

        public String getDay()
        {
            return day;
        }

        public void setDay(String day)
        {
            this.day = day;
        }
    }
}
