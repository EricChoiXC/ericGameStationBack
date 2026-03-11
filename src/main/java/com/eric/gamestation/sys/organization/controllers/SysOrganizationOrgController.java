package com.eric.gamestation.sys.organization.controllers;

import com.eric.gamestation.sys.base.controllers.BaseController;
import com.eric.gamestation.sys.base.models.BaseReq;
import com.eric.gamestation.sys.base.models.BaseResp;
import com.eric.gamestation.sys.organization.models.vo.SysOrganizationOrgVo;

public class SysOrganizationOrgController extends BaseController<SysOrganizationOrgVo> {

    @Override
    public BaseResp<SysOrganizationOrgVo> load(BaseReq<SysOrganizationOrgVo> req) {
        BaseResp<SysOrganizationOrgVo> resp = new BaseResp<>();
        resp.setResult(new SysOrganizationOrgVo());
        return resp;
    }
}
