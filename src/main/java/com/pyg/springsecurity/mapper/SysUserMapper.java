package com.pyg.springsecurity.mapper;

import com.pyg.springsecurity.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser selectByUsername(String username);
}
