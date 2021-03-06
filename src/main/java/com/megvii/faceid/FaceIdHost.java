package com.megvii.faceid;

import com.megvii.faceid.util.Const;

public enum FaceIdHost
{
    China(Const.API_HOST_URL_CHINA),
//    ChinaIPV6(Const.API_HOST_URL_CHINA_IPV6),
    Indonesia(Const.API_HOST_URL_IDN),
    Singapore(Const.API_HOST_URL_SGP);

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
