package com.github.w4o.manage.service;

import com.github.w4o.manage.dto.param.AddDeptParam;

/**
 * @author frank
 * @date 2021/12/17
 */
public interface DeptService {

    /**
     * 添加机构
     *
     * @param param 请求参数
     */
    void add(AddDeptParam param);

}
