package com.eric.gamestation.sys.base.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Data
@Slf4j
public class BaseModel {

    protected String fieldId;

    protected String fieldName;

    public String toString() {
        try {
            Field[] fields = this.getClass().getDeclaredFields();
            StringBuilder strs = new StringBuilder();
            strs.append("{");
            for (Field field : fields) {
                String fieldName = field.getName();
                try {
                    StringBuilder getMethodName = new StringBuilder("get");
                    getMethodName.append(fieldName.substring(0, 1).toUpperCase()).append(fieldName.substring(1));
                    Object value = this.getClass().getMethod(getMethodName.toString()).invoke(this);
                    strs.append(fieldName).append(":").append(value).append(";");
                } catch (Exception e) {
                    strs.append(fieldName).append(":GET VALUE ERROR;");
                }
            }
            strs.append("}");
            return strs.toString();
        } catch (Exception e) {
            log.error("Parse ToString error : ", e);
            return null;
        }
    }

}
