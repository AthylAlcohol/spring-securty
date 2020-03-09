package com.pyg.springsecurity.mapper;

import com.pyg.springsecurity.entity.SysRoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    List<SysRoleMenu> selectByRoleId(Integer roleId);
}
