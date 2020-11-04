package com.megvii.faceid;

import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpManager;
import com.megvii.faceid.network.http.HttpResponse;

public class FaceID
{
    private final FaceIDConfig mFaceIDConfig;
    private final HttpManager mHttpManager;

    public FaceID(FaceIDConfig faceidConfig)
    {
        this(faceidConfig, HttpConfig.getDefault());
    }

    public FaceID(FaceIDConfig faceidConfig, HttpConfig httpConfig)
    {
        this.mFaceIDConfig = faceidConfig;
        this.mHttpManager = new HttpManager(httpConfig);
    }

    public DetectResponse detect(DetectRequest req)
    {
        HttpResponse response = mHttpManager.postFormData(null);
        return new DetectResponse();
    }
}
