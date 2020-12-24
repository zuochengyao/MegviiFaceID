package com.megvii.faceid.model.base.verify;

import com.megvii.faceid.model.base.auth.KeyRequest;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public abstract class CompareKeyRequest extends KeyRequest
{
    private static final String COMPARISON_TYPE_COMPARE = "0";
    private static final String COMPARISON_TYPE_KYC = "1";

    private String comparisonType;
    private String idcardName;
    private String idcardNumber;
    private String uuid;
    private byte[] imageRef1;
    private byte[] imageRef2;
    private String multiOrientedDetection;

    public String getComparisonType()
    {
        return comparisonType;
    }

    public void setComparisonType(String comparisonType)
    {
        this.comparisonType = comparisonType;
    }

    public String getIdcardName()
    {
        return idcardName;
    }

    public void setIdcardName(String idcardName)
    {
        this.idcardName = idcardName;
    }

    public String getIdcardNumber()
    {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber)
    {
        this.idcardNumber = idcardNumber;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public byte[] getImageRef1()
    {
        return imageRef1;
    }

    public void setImageRef1(byte[] imageRef1)
    {
        this.imageRef1 = imageRef1;
    }

    public void setImageRef1(File imageRef1)
    {
        if (imageRef1 != null)
            setImageRef1(CommonUtils.getFileBytes(imageRef1));
    }

    public byte[] getImageRef2()
    {
        return imageRef2;
    }

    public void setImageRef2(byte[] imageRef2)
    {
        this.imageRef2 = imageRef2;
    }

    public void setImageRef2(File imageRef2)
    {
        if (imageRef2 != null)
            setImageRef2(CommonUtils.getFileBytes(imageRef2));
    }

    public String getMultiOrientedDetection()
    {
        return multiOrientedDetection;
    }

    public void setMultiOrientedDetection(String multiOrientedDetection)
    {
        this.multiOrientedDetection = multiOrientedDetection;
    }

    @Override
    public void toMap()
    {
        super.toMap();
        this.addStringParam(Const.API_PARAM_COMPARISON_TYPE, comparisonType);
        if (COMPARISON_TYPE_KYC.equals(comparisonType))
        {
            this.addStringParam(Const.API_PARAM_IDCARD_NAME, idcardName);
            this.addStringParam(Const.API_PARAM_IDCARD_NUMBER, idcardNumber);
            if (imageRef1 != null && imageRef1.length > 0)
                this.addBinaryParam(Const.API_PARAM_IMAGE_REF1, imageRef1);
            if (imageRef2 != null && imageRef2.length > 0)
                this.addBinaryParam(Const.API_PARAM_IMAGE_REF2, imageRef2);
        }
        else if (COMPARISON_TYPE_COMPARE.equals(comparisonType))
        {
            this.addStringParam(Const.API_PARAM_UUID, uuid);
            this.addBinaryParam(Const.API_PARAM_IMAGE_REF1, imageRef1);
            if (imageRef2 != null && imageRef2.length > 0)
                this.addBinaryParam(Const.API_PARAM_IMAGE_REF2, imageRef2);
        }
        if (!CommonUtils.isNullOrEmpty(multiOrientedDetection))
            this.addStringParam(Const.API_PARAM_MULTI_ORIENTED_DETECTION, multiOrientedDetection);
    }
}
