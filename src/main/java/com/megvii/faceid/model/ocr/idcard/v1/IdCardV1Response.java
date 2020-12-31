package com.megvii.faceid.model.ocr.idcard.v1;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.model.base.common.Legality;
import com.megvii.faceid.model.base.common.PointRectF;
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

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Birthday getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Birthday birthday)
    {
        this.birthday = birthday;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getIdcardNumber()
    {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber)
    {
        this.idcardNumber = idcardNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRace()
    {
        return race;
    }

    public void setRace(String race)
    {
        this.race = race;
    }

    public String getSide()
    {
        return side;
    }

    public void setSide(String side)
    {
        this.side = side;
    }

    public String getIssuedBy()
    {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy)
    {
        this.issuedBy = issuedBy;
    }

    public String getValidDate()
    {
        return validDate;
    }

    public void setValidDate(String validDate)
    {
        this.validDate = validDate;
    }

    public Legality getLegality()
    {
        return legality;
    }

    public void setLegality(Legality legality)
    {
        this.legality = legality;
    }

    public PointRectF getHeadRect()
    {
        return headRect;
    }

    public void setHeadRect(PointRectF headRect)
    {
        this.headRect = headRect;
    }

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
