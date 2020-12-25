package com.megvii.faceid.model.common;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public class Legality
{
    @SerializedName(value = Const.API_PARAM_LEGALITY_ID_PHOTO_V2, alternate = Const.API_PARAM_LEGALITY_ID_PHOTO_V1)
    private float idPhoto;
    @SerializedName(value = Const.API_PARAM_LEGALITY_TEMPORARY_ID_PHOTO_V2, alternate = Const.API_PARAM_LEGALITY_TEMPORARY_ID_PHOTO_V1)
    private float temporaryIdPhoto;
    @SerializedName(Const.API_PARAM_LEGALITY_PHOTOCOPY)
    private float photocopy;
    @SerializedName(Const.API_PARAM_LEGALITY_SCREEN)
    private float screen;
    @SerializedName(Const.API_PARAM_LEGALITY_EDITED)
    private float edited;
    @SerializedName(Const.API_PARAM_LEGALITY_ID_PHOTO_THRESHOLD)
    private float idPhotoThreshold;

    public float getIdPhoto()
    {
        return idPhoto;
    }

    public void setIdPhoto(float idPhoto)
    {
        this.idPhoto = idPhoto;
    }

    public float getTemporaryIdPhoto()
    {
        return temporaryIdPhoto;
    }

    public void setTemporaryIdPhoto(float temporaryIdPhoto)
    {
        this.temporaryIdPhoto = temporaryIdPhoto;
    }

    public float getPhotocopy()
    {
        return photocopy;
    }

    public void setPhotocopy(float photocopy)
    {
        this.photocopy = photocopy;
    }

    public float getScreen()
    {
        return screen;
    }

    public void setScreen(float screen)
    {
        this.screen = screen;
    }

    public float getEdited()
    {
        return edited;
    }

    public void setEdited(float edited)
    {
        this.edited = edited;
    }

    public float getIdPhotoThreshold()
    {
        return idPhotoThreshold;
    }

    public void setIdPhotoThreshold(float idPhotoThreshold)
    {
        this.idPhotoThreshold = idPhotoThreshold;
    }
}
