package com.megvii.faceid.model.common;

import com.google.gson.annotations.SerializedName;
import com.megvii.faceid.util.Const;

public class ImageList
{
    @SerializedName(Const.API_PARAM_IMAGE_BEST)
    private String imageBest;
    @SerializedName(Const.API_PARAM_IMAGE_ACTION1)
    private String imageAction1;
    @SerializedName(Const.API_PARAM_IMAGE_ACTION2)
    private String imageAction2;
    @SerializedName(Const.API_PARAM_IMAGE_ACTION3)
    private String imageAction3;

    public String getImageBest()
    {
        return imageBest;
    }

    public void setImageBest(String imageBest)
    {
        this.imageBest = imageBest;
    }

    public String getImageAction1()
    {
        return imageAction1;
    }

    public void setImageAction1(String imageAction1)
    {
        this.imageAction1 = imageAction1;
    }

    public String getImageAction2()
    {
        return imageAction2;
    }

    public void setImageAction2(String imageAction2)
    {
        this.imageAction2 = imageAction2;
    }

    public String getImageAction3()
    {
        return imageAction3;
    }

    public void setImageAction3(String imageAction3)
    {
        this.imageAction3 = imageAction3;
    }
}
