package com.megvii.faceid;

import com.megvii.faceid.model.base.BaseKeyModel;
import com.megvii.faceid.model.base.BaseSignModel;
import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.http.HttpManager;
import com.megvii.faceid.http.HttpConfig;
import com.megvii.faceid.http.base.HttpMethod;
import com.megvii.faceid.http.HttpRequest;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class FaceIdClient
{
    private final FaceIdConfig faceIdConfig;
    private final HttpManager httpManager;
    private FaceIdHost host = FaceIdHost.China;

//    private HashMap<String, Object> KEY_MAP = new HashMap<>();

    public FaceIdClient(String apiKey, String apiSecret)
    {
        this(new FaceIdConfig(apiKey, apiSecret));
    }


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
        HttpRequest request = new HttpRequest(host.getHostUrl().concat(DetectRequest.API_URL), req);
        request.setHttpMethod(HttpMethod.POST);
        httpManager.execute(request);
        return null;
    }

    public void detect(DetectRequest req, IFaceIdCallback<DetectResponse> callback)
    {

    }

    private void setKeyAndSecret(@NotNull BaseKeyModel model)
    {
        model.setApiKey(faceIdConfig.getApiKey());
        model.setApiSecret(faceIdConfig.getApiSecret());
        model.toMap();
    }

    private void setSign(@NotNull BaseSignModel model)
    {
        model.setSign(faceIdConfig.getApiSign());
        model.toMap();
    }
}
