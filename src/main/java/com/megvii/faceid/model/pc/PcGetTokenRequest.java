package com.megvii.faceid.model.pc;

import com.megvii.faceid.model.base.h5.H5KeyRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class PcGetTokenRequest extends H5KeyRequest
{
    private byte[] imageRef3;
    private String screenReplay;

    public byte[] getImageRef3()
    {
        return imageRef3;
    }

    public void setImageRef3(byte[] imageRef3)
    {
        this.imageRef3 = imageRef3;
    }

    public void setImageRef3(File imageRef3)
    {
        if (imageRef3 != null)
            setImageRef3(CommonUtils.getFileBytes(imageRef3));
    }

    public String getScreenReplay()
    {
        return screenReplay;
    }

    public void setScreenReplay(String screenReplay)
    {
        this.screenReplay = screenReplay;
    }

    @NotNull
    @Override
    public String getUrl()
    {
        return "/faceid/liveness/v2/get_token";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }

    @Override
    public void toMap()
    {
        super.toMap();
        if (imageRef3 != null && imageRef3.length > 0)
            this.addBinaryParam(Const.API_PARAM_IMAGE_REF3, imageRef3);
        if (!CommonUtils.isNullOrEmpty(screenReplay))
            this.addStringParam(Const.API_PARAM_SCREEN_REPLAY, screenReplay);
    }
}
