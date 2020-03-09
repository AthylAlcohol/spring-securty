package com.pyg.springsecurity.mapper;

import com.pyg.springsecurity.entity.SysUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    SysUserRole selectByUserId(Integer userId);
}
