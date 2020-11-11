package com.megvii.faceid;

import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpManager;
import com.megvii.faceid.network.http.HttpResponse;

public class FaceIDClient
{
    private final FaceIDConfig mFaceIDConfig;
    private final HttpManager mHttpManager;

    public FaceIDClient(FaceIDConfig faceidConfig)
    {
        this(faceidConfig, HttpConfig.getDefault());
    }

    public FaceIDClient(FaceIDConfig faceidConfig, HttpConfig httpConfig)
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
