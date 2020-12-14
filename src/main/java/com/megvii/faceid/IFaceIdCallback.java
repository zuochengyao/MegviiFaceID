package com.megvii.faceid;

import com.megvii.faceid.model.base.response.BaseResponse;

public interface IFaceIdCallback<T extends BaseResponse>
{
    void onSuccess(T response);

    void onFailed(int errorCode, String errorMessage);
}
