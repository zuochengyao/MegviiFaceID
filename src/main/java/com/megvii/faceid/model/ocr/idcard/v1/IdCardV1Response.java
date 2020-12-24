package com.megvii.faceid.model.ocr.idcard.v1;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.model.ocr.idcard.Legality;
import com.megvii.faceid.model.ocr.RectF;

public class IdCardV1Response extends BaseResponse
{
    private String address;
    private Birthday birthday;
    private String gender;
    @SerializedName("id_card_number")
    private String idcardNumber;
    private String name;
    private String race;
    private String side;
    @SerializedName("issued_by")
    private String issuedBy;
    @SerializedName("valid_date")
    private String validDate;
    private Legality legality;
    @SerializedName("head_rect")
    private RectF headRect;

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
