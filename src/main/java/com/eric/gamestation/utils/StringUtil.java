package com.eric.gamestation.utils;

public class StringUtil {

    public Boolean isNull(String str) {
        if (null == str) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public Boolean isNotNull(String str) {
        return !isNull(str);
    }

    public Boolean equals(String compareStr1, String compareStr2) {
        if (null == compareStr1 && null == compareStr2) {
            return true;
        } else if (null == compareStr1 || null == compareStr2) {
            return false;
        }
        return compareStr1.equals(compareStr2);
    }

    public String splice(String leftStr, String rightStr) {
        if (isNull(leftStr)) {
            return rightStr;
        } else if (isNull(rightStr)) {
            return leftStr;
        } else {
            return leftStr + rightStr;
        }
    }

}
