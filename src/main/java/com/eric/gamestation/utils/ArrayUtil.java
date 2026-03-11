package com.eric.gamestation.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtil {

    public String join(List<String> list, String characters) {
        if (null == list || list.isEmpty()) {
            return "";
        }
        return String.join(characters, list);
    }
}
