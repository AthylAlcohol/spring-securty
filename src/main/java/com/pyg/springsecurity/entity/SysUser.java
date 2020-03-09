package com.pyg.springsecurity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author zouYunHao
 * @since 2020-01-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 系统用户主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 系统用户登陆账号
     */
    private String username;

    /**
     * 系统用户登陆密码
     */
    private String password;

    /**
     * 系统用户全称
     */
    private String fullName;

    /**
     * 系统用户启用（0-否，1-是）
     */
    private Boolean enabled;

    /**
     * 账户非锁定（0-否，1-是）
     */
    private Boolean accountNonLocked;


}
