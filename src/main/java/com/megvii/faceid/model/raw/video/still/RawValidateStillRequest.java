package com.megvii.faceid.model.raw.video.still;

import com.megvii.faceid.model.raw.video.RawVideoRequest;
import com.megvii.faceid.util.Const;

public class RawValidateStillRequest extends RawVideoRequest
{
    private String livenessPreferences;

    public String getLivenessPreferences()
    {
        return livenessPreferences;
    }

    public void setLivenessPreferences(String livenessPreferences)
    {
        this.livenessPreferences = livenessPreferences;
        this.addStringParam(Const.API_PARAM_LIVENESS_PREFERENCES, livenessPreferences);
    }

    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/validate_still";
    }
}
