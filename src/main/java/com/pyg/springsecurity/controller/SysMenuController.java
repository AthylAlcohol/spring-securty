package com.pyg.springsecurity.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
@RestController
@RequestMapping("/sys-menu")
public class SysMenuController {

    @RequestMapping("getMenu")
    @PreAuthorize("hasAuthority('auth:menu')")
    @ResponseBody
    public String getMenu(){
        return "菜单页面";
    }


    @RequestMapping("getNone")
    @ResponseBody
    public String getNone(){
        return "none";
    }
}
