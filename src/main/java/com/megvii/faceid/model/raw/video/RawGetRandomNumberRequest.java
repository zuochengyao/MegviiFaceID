package com.megvii.faceid.model.raw.video;

import com.megvii.faceid.model.raw.RawBaseRequest;

public class RawGetRandomNumberRequest extends RawBaseRequest
{
    @Override
    public String getUrl()
    {
        return "/faceid/lite/raw/get_random_number";
    }
}
