package com.megvii.faceid.model.common;

import com.google.gson.annotations.SerializedName;

public class Legality
{
    @SerializedName(value = "ID_Photo", alternate = "ID Photo")
    private float idPhoto;
    @SerializedName(value = "Temporary_ID_Photo", alternate = "Temporary ID Photo")
    private float temporaryIdPhoto;
    @SerializedName("Photocopy")
    private float photocopy;
    @SerializedName("Screen")
    private float screen;
    @SerializedName("Edited")
    private float edited;
    @SerializedName("ID_Photo_Threshold")
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
