package com.megvii.faceid;

import com.megvii.faceid.model.base.request.BaseKeyRequest;
import com.megvii.faceid.model.base.request.BaseSignRequest;
import com.megvii.faceid.model.detect.DetectRequest;
import com.megvii.faceid.model.detect.DetectResponse;
import com.megvii.faceid.network.HttpConfig;
import com.megvii.faceid.network.HttpManager;
import com.megvii.faceid.network.HttpRequest;
import com.megvii.faceid.network.HttpResponse;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class FaceIdClient
{
    private final FaceIdConfig faceIdConfig;
    private final HttpManager httpManager;
    private FaceIdHost host = FaceIdHost.China;

//    private HashMap<String, Object> KEY_MAP = new HashMap<>();

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
        HttpRequest request = new HttpRequest(host.getHostUrl().concat(req.getUrl()), req);
        HttpResponse response = httpManager.execute(request);
        return response.toJsonObject(DetectResponse.class);
    }

    /*
    保留异步请求
    public void detect(DetectRequest req, IFaceIdCallback<DetectResponse> callback) throws IOException
    {
        setKeyAndSecret(req);
        HttpRequest request = new HttpRequest(host.getHostUrl().concat(req.getUrl()), req);
        httpManager.enqueue(request);
    }
     */

    private void setKeyAndSecret(@NotNull BaseKeyRequest model)
    {
        model.setApiKey(faceIdConfig.getApiKey());
        model.setApiSecret(faceIdConfig.getApiSecret());
        model.toMap();
    }

    private void setSign(@NotNull BaseSignRequest model)
    {
        model.setSign(faceIdConfig.getApiSign());
        model.toMap();
    }
}
