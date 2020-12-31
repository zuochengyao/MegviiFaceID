package com.megvii.faceid.model.base.common;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public class IdExceptions
{
    @SerializedName(Const.API_PARAM_ID_ATTACKED)
    private int idAttacked;
    @SerializedName(Const.API_PARAM_ID_PHOTO_MONOCHROME)
    private int idPhotoMonochrome;

    public int getIdAttacked()
    {
        return idAttacked;
    }

    public void setIdAttacked(int idAttacked)
    {
        this.idAttacked = idAttacked;
    }

    public int getIdPhotoMonochrome()
    {
        return idPhotoMonochrome;
    }

    public void setIdPhotoMonochrome(int idPhotoMonochrome)
    {
        this.idPhotoMonochrome = idPhotoMonochrome;
    }
}
