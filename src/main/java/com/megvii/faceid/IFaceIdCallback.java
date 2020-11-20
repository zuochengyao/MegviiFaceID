package com.megvii.faceid;

import com.megvii.faceid.model.base.BaseResponseModel;

public interface IFaceIdCallback<T extends BaseResponseModel>
{
    void onSuccess(T response);

    void onFailed(String error);
}
