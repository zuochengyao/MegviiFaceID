package com.megvii.faceid.model.ocr.idcard.v2;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.BaseResponse;
import com.megvii.faceid.model.common.Legality;
import com.megvii.faceid.model.common.PointRect;

public class IdCardV2Response extends BaseResponse
{
    private Integer result;
    private Integer side;
    private Dict name;
    private Dict gender;
    private Dict nationality;
    @SerializedName("birth_year")
    private Dict birthYear;
    @SerializedName("birth_month")
    private Dict birthMonth;
    @SerializedName("birth_day")
    private Dict birthDay;
    @SerializedName("idcard_number")
    private Dict idcardNumber;
    private Dict address;
    private Dict portrait;
    @SerializedName("issued_by")
    private Dict issuedBy;
    @SerializedName("valid_date_start")
    private Dict validDateStart;
    @SerializedName("valid_date_end")
    private Dict validDateEnd;
    private Legality legality;
    private Integer completeness;

    public int getResult()
    {
        return result;
    }

    public void setResult(int result)
    {
        this.result = result;
    }

    public int getSide()
    {
        return side;
    }

    public void setSide(int side)
    {
        this.side = side;
    }

    public Dict getName()
    {
        return name;
    }

    public void setName(Dict name)
    {
        this.name = name;
    }

    public Dict getGender()
    {
        return gender;
    }

    public void setGender(Dict gender)
    {
        this.gender = gender;
    }

    public Dict getNationality()
    {
        return nationality;
    }

    public void setNationality(Dict nationality)
    {
        this.nationality = nationality;
    }

    public Dict getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(Dict birthYear)
    {
        this.birthYear = birthYear;
    }

    public Dict getBirthMonth()
    {
        return birthMonth;
    }

    public void setBirthMonth(Dict birthMonth)
    {
        this.birthMonth = birthMonth;
    }

    public Dict getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(Dict birthDay)
    {
        this.birthDay = birthDay;
    }

    public Dict getIdcardNumber()
    {
        return idcardNumber;
    }

    public void setIdcardNumber(Dict idcardNumber)
    {
        this.idcardNumber = idcardNumber;
    }

    public Dict getAddress()
    {
        return address;
    }

    public void setAddress(Dict address)
    {
        this.address = address;
    }

    public Dict getPortrait()
    {
        return portrait;
    }

    public void setPortrait(Dict portrait)
    {
        this.portrait = portrait;
    }

    public Dict getIssuedBy()
    {
        return issuedBy;
    }

    public void setIssuedBy(Dict issuedBy)
    {
        this.issuedBy = issuedBy;
    }

    public Dict getValidDateStart()
    {
        return validDateStart;
    }

    public void setValidDateStart(Dict validDateStart)
    {
        this.validDateStart = validDateStart;
    }

    public Dict getValidDateEnd()
    {
        return validDateEnd;
    }

    public void setValidDateEnd(Dict validDateEnd)
    {
        this.validDateEnd = validDateEnd;
    }

    public Legality getLegality()
    {
        return legality;
    }

    public void setLegality(Legality legality)
    {
        this.legality = legality;
    }

    public int getCompleteness()
    {
        return completeness;
    }

    public void setCompleteness(int completeness)
    {
        this.completeness = completeness;
    }

    public static class Dict
    {
        private String result;
        private float quality;
        private int logic;
        private PointRect rect;

        public String getResult()
        {
            return result;
        }

        public void setResult(String result)
        {
            this.result = result;
        }

        public float getQuality()
        {
            return quality;
        }

        public void setQuality(float quality)
        {
            this.quality = quality;
        }

        public int getLogic()
        {
            return logic;
        }

        public void setLogic(int logic)
        {
            this.logic = logic;
        }

        public PointRect getRect()
        {
            return rect;
        }

        public void setRect(PointRect rect)
        {
            this.rect = rect;
        }
    }
}
