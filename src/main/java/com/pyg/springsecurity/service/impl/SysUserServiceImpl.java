package com.pyg.springsecurity.service.impl;

import com.pyg.springsecurity.entity.SysUser;
import com.pyg.springsecurity.service.ISysUserService;
import com.pyg.springsecurity.mapper.SysUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
@Service
@Slf4j
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {


}
