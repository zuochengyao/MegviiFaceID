package com.megvii.faceid.model.raw.selfie;

import com.megvii.faceid.model.raw.RawBaseRequest;
import com.megvii.faceid.util.CommonUtils;
import com.megvii.faceid.util.Const;

import java.io.File;

public abstract class RawSelfieRequest extends RawBaseRequest
{
    private byte[] selfie;

    public byte[] getSelfie()
    {
        return selfie;
    }

    public void setSelfie(File selfie)
    {
        if (selfie != null)
            this.setSelfie(CommonUtils.getFileBytes(selfie));
    }

    public void setSelfie(byte[] selfie)
    {
        this.selfie = selfie;
        this.addBinaryParam(Const.API_PARAM_SELFIE, selfie);
    }
}
