package com.megvii.faceid.model.raw;

import com.megvii.faceid.model.base.auth.IKeyRequest;
import com.megvii.faceid.model.base.request.BaseRequest;
import com.megvii.faceid.network.http.HttpMethod;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public class RawValidateVideoRequest extends BaseRequest implements IKeyRequest
{
    private String tokenRandomNumber;
    private byte[] video;
    private String bizNo;
    private String returnImage;

    public String getTokenRandomNumber()
    {
        return tokenRandomNumber;
    }

    public void setTokenRandomNumber(String tokenRandomNumber)
    {
        this.tokenRandomNumber = tokenRandomNumber;
        this.addStringParam(Const.API_PARAM_TOKEN_RANDOM_NUMBER, tokenRandomNumber);
    }

    public byte[] getVideo()
    {
        return video;
    }

    public void setVideo(File video)
    {
        if (video != null)
            setVideo(CommonUtils.getFileBytes(video));
    }

    public void setVideo(byte[] video)
    {
        this.video = video;
        this.addBinaryParam(Const.API_PARAM_VIDEO, video);
    }

    public String getBizNo()
    {
        return bizNo;
    }

    public void setBizNo(String bizNo)
    {
        this.bizNo = bizNo;
        this.addStringParam(Const.API_PARAM_BIZ_NO, bizNo);
    }

    public String getReturnImage()
    {
        return returnImage;
    }

    public void setReturnImage(String returnImage)
    {
        this.returnImage = returnImage;
        this.addStringParam(Const.API_PARAM_RETURN_IMAGE, returnImage);
    }

    @Override
    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.addStringParam(Const.API_PARAM_API_KEY, apiKey);
    }

    @Override
    public void setApiSecret(String apiSecret)
    {
        this.apiSecret = apiSecret;
        this.addStringParam(Const.API_PARAM_API_SECRET, apiSecret);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_video";
    }

    @Override
    public HttpMethod method()
    {
        return HttpMethod.POST;
    }
}
