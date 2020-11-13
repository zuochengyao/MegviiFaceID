package com.megvii.faceid;

import com.megvii.faceid.model.base.BaseKeyModel;
import com.megvii.faceid.model.base.BaseSignModel;
import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.network.http.HttpConfig;
import com.megvii.faceid.network.http.HttpManager;
import com.megvii.faceid.network.http.HttpRequest;
import com.megvii.faceid.network.http.HttpResponse;
import com.megvii.faceid.network.http.base.HttpMethod;

import java.io.IOException;

public class FaceIdClient
{
    private final FaceIdConfig faceIdConfig;
    private final HttpManager httpManager;
    private FaceIdHost host = FaceIdHost.China;

    public FaceIdClient(FaceIdConfig faceidConfig)
    {
        this(faceidConfig, HttpConfig.getDefault());
    }

    public FaceIdClient(FaceIdConfig faceidConfig, HttpConfig httpConfig)
    {
        this.faceIdConfig = faceidConfig;
        this.httpManager = new HttpManager(httpConfig);
    }

    public void setHost(FaceIdHost host)
    {
        this.host = host;
    }

    public DetectResponse detect(DetectRequest req) throws IOException
    {
        setKeyAndSecret(req);
        req.toMap();
        HttpRequest request = new HttpRequest(host.getHostUrl().concat(DetectRequest.API_URL), req);
        request.setHttpMethod(HttpMethod.POST);
        HttpResponse response = httpManager.execute(request);
        return null;
    }

    private void setKeyAndSecret(BaseKeyModel model)
    {
        model.setApiKey(faceIdConfig.getApiKey());
        model.setApiSecret(faceIdConfig.getApiSecret());
    }

    private void setSign(BaseSignModel model)
    {
        model.setSign(faceIdConfig.getApiSign());
    }
}
