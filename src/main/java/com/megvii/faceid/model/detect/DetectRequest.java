package com.megvii.faceid.model.detect;

import com.megvii.faceid.model.base.BaseKeyModel;

import java.io.File;

public class DetectRequest extends BaseKeyModel
{
    private File image;
    private String returnPortrait;

    @Override
    protected void toMap()
    {

    }
}
