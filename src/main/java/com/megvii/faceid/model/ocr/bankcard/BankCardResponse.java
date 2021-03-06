package com.megvii.faceid.model.ocr.bankcard;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.model.base.response.BaseResponse;
import com.megvii.faceid.model.base.common.PointRect;
import com.megvii.faceid.util.Const;

public class BankCardResponse extends BaseResponse
{
    private int result;
    private String number;
    private String bank;
    private String organization;
    @SerializedName(Const.API_PARAM_VALID_DATE)
    private String validDate;
    private String name;
    private PointRect position;

    public int getResult()
    {
        return result;
    }

    public void setResult(int result)
    {
        this.result = result;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getBank()
    {
        return bank;
    }

    public void setBank(String bank)
    {
        this.bank = bank;
    }

    public String getOrganization()
    {
        return organization;
    }

    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public String getValidDate()
    {
        return validDate;
    }

    public void setValidDate(String validDate)
    {
        this.validDate = validDate;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public PointRect getPosition()
    {
        return position;
    }

    public void setPosition(PointRect position)
    {
        this.position = position;
    }
}
