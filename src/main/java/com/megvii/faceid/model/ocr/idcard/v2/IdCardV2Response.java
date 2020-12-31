package com.megvii.faceid.model.ocr.idcard.v2;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.model.base.common.IdcardDict;
import com.megvii.faceid.model.base.common.Legality;
import com.megvii.faceid.util.Const;

public class IdCardV2Response extends BaseResponse
{
    private Integer result;
    private Integer side;
    private IdcardDict name;
    private IdcardDict gender;
    private IdcardDict nationality;
    @SerializedName(Const.API_PARAM_BIRTH_YEAR)
    private IdcardDict birthYear;
    @SerializedName(Const.API_PARAM_BIRTH_MONTH)
    private IdcardDict birthMonth;
    @SerializedName(Const.API_PARAM_BIRTH_DAY)
    private IdcardDict birthDay;
    @SerializedName(Const.API_PARAM_IDCARD_NUMBER)
    private IdcardDict idcardNumber;
    private IdcardDict address;
    private IdcardDict portrait;
    @SerializedName(Const.API_PARAM_ISSUED_BY)
    private IdcardDict issuedBy;
    @SerializedName(Const.API_PARAM_VALID_DATE_START)
    private IdcardDict validDateStart;
    @SerializedName(Const.API_PARAM_VALID_DATE_END)
    private IdcardDict validDateEnd;
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

    public IdcardDict getName()
    {
        return name;
    }

    public void setName(IdcardDict name)
    {
        this.name = name;
    }

    public IdcardDict getGender()
    {
        return gender;
    }

    public void setGender(IdcardDict gender)
    {
        this.gender = gender;
    }

    public IdcardDict getNationality()
    {
        return nationality;
    }

    public void setNationality(IdcardDict nationality)
    {
        this.nationality = nationality;
    }

    public IdcardDict getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(IdcardDict birthYear)
    {
        this.birthYear = birthYear;
    }

    public IdcardDict getBirthMonth()
    {
        return birthMonth;
    }

    public void setBirthMonth(IdcardDict birthMonth)
    {
        this.birthMonth = birthMonth;
    }

    public IdcardDict getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(IdcardDict birthDay)
    {
        this.birthDay = birthDay;
    }

    public IdcardDict getIdcardNumber()
    {
        return idcardNumber;
    }

    public void setIdcardNumber(IdcardDict idcardNumber)
    {
        this.idcardNumber = idcardNumber;
    }

    public IdcardDict getAddress()
    {
        return address;
    }

    public void setAddress(IdcardDict address)
    {
        this.address = address;
    }

    public IdcardDict getPortrait()
    {
        return portrait;
    }

    public void setPortrait(IdcardDict portrait)
    {
        this.portrait = portrait;
    }

    public IdcardDict getIssuedBy()
    {
        return issuedBy;
    }

    public void setIssuedBy(IdcardDict issuedBy)
    {
        this.issuedBy = issuedBy;
    }

    public IdcardDict getValidDateStart()
    {
        return validDateStart;
    }

    public void setValidDateStart(IdcardDict validDateStart)
    {
        this.validDateStart = validDateStart;
    }

    public IdcardDict getValidDateEnd()
    {
        return validDateEnd;
    }

    public void setValidDateEnd(IdcardDict validDateEnd)
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
}
