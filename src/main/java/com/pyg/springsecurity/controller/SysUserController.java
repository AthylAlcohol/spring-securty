package com.pyg.springsecurity.controller;


import com.pyg.springsecurity.entity.SysUser;
import com.pyg.springsecurity.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
@Controller
@RequestMapping("/sys-user")
public class SysUserController {

    @Autowired
    private ISysUserService userService;



    @RequestMapping("/loginUser")
    @ResponseBody
    public String getLoginUser(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }
        if (principal instanceof Principal) {
            return ((Principal) principal).getName();
        }
        return String.valueOf(principal);
    }

    @RequestMapping("loginError")
    public String loginError(){
        return "error";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

}
