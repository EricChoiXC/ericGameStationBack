package com.eric.gamestation.sys.base.models;

import com.alibaba.fastjson2.JSONObject;
import lombok.Data;

import java.util.List;

@Data
public class BaseResp<T> {

    private T result;

    private List<T> list;

    private JSONObject params;

    private int webCode;

    private int resultCode;

    private String resultMessage;

}
