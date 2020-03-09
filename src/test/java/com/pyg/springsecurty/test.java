package com.pyg.springsecurty;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName test
 * @Description TODO
 * @Date 2020/1/3 下午 06:25
 * @Version 1.0
 **/
public class test {
    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("123");
        System.out.println(encode);
    }
}
