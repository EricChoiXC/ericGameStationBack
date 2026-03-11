package com.eric.gamestation.sys.base.controllers;

import com.eric.gamestation.sys.base.models.BaseReq;
import com.eric.gamestation.sys.base.models.BaseResp;

public class BaseController<T> {

    public BaseResp<T> insert(BaseReq<T> req) {
        return new BaseResp<>();
    }

    public BaseResp<T> update(BaseReq<T> req) {
        return new BaseResp<>();
    }

    public BaseResp<T> load(BaseReq<T> req) {
        return new BaseResp<>();
    }

    public BaseResp<T> delete(BaseReq<T> req) {
        return new BaseResp<T>();
    }

    public BaseResp<T> list(BaseReq<T> req) {
        return new BaseResp<T>();
    }
}
