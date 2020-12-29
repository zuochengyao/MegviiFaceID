package com.megvii.faceid.model.base.request;

import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public abstract class CompareRequest extends BaseRequest
{
    protected String comparisonType;
    protected String idcardName;
    protected String idcardNumber;
    protected String uuid;
    protected byte[] imageRef1;
    protected byte[] imageRef2;
    protected String multiOrientedDetection;

    public String getComparisonType()
    {
        return comparisonType;
    }

    public void setComparisonType(String comparisonType)
    {
        this.comparisonType = comparisonType;
        this.addStringParam(Const.API_PARAM_COMPARISON_TYPE, comparisonType);
    }

    public String getIdcardName()
    {
        return idcardName;
    }

    public void setIdcardName(String idcardName)
    {
        this.idcardName = idcardName;
        this.addStringParam(Const.API_PARAM_IDCARD_NAME, idcardName);
    }

    public String getIdcardNumber()
    {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber)
    {
        this.idcardNumber = idcardNumber;
        this.addStringParam(Const.API_PARAM_IDCARD_NUMBER, idcardNumber);
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
        this.addStringParam(Const.API_PARAM_UUID, uuid);
    }

    public byte[] getImageRef1()
    {
        return imageRef1;
    }

    public void setImageRef1(byte[] imageRef1)
    {
        this.imageRef1 = imageRef1;
        this.addBinaryParam(Const.API_PARAM_IMAGE_REF1, imageRef1);
    }

    public void setImageRef1(File imageRef1)
    {
        setImageRef1(CommonUtils.getFileBytes(imageRef1));
    }

    public byte[] getImageRef2()
    {
        return imageRef2;
    }

    public void setImageRef2(byte[] imageRef2)
    {
        this.imageRef2 = imageRef2;
        this.addBinaryParam(Const.API_PARAM_IMAGE_REF2, imageRef2);
    }

    public void setImageRef2(File imageRef2)
    {
        setImageRef2(CommonUtils.getFileBytes(imageRef2));
    }

    public String getMultiOrientedDetection()
    {
        return multiOrientedDetection;
    }

    public void setMultiOrientedDetection(String multiOrientedDetection)
    {
        this.multiOrientedDetection = multiOrientedDetection;
        this.addStringParam(Const.API_PARAM_MULTI_ORIENTED_DETECTION, multiOrientedDetection);
    }
}
