package com.megvii.faceid;

import com.megvii.faceid.common.Const;

public enum FaceIdHost
{
    China(Const.API_HOST_URL_CHINA),
    ChinaIPV6(Const.API_HOST_URL_CHINA_IPV6),
    Indonesia(Const.API_HOST_URL_CHINA_IDN),
    Singapore(Const.API_HOST_URL_CHINA_SGP);

    private final String host;

    FaceIdHost(String host)
    {
        this.host = host;
    }

    public String getHostUrl()
    {
        return host;
    }
}
