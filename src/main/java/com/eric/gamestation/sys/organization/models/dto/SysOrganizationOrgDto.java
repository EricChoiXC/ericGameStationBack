package com.eric.gamestation.sys.organization.models.dto;

import com.eric.gamestation.sys.base.models.BaseModel;
import lombok.Data;

@Data
public class SysOrganizationOrgDto extends BaseModel {

    protected String fieldCode;

    protected Integer fieldOrder;

    protected String fieldNickName;

    protected String fieldParentId;

    protected String parentName;

    protected String hibernateId;

    protected String hibernateName;

}
