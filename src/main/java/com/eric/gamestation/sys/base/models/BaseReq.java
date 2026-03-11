package com.eric.gamestation.sys.base.models;

import com.alibaba.fastjson2.JSONObject;
import lombok.Data;

@Data
public class BaseReq<T> {

    private T body;

    private JSONObject params;

    private JSONObject headers;
}
