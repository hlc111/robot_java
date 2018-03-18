package com.eservice.api.model;

import javax.persistence.*;

@Table(name = "rb_user")
public class RbUser {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String account;

    /**
     * 密码，加密以后，默认跟账号相同
     */
    private String password;

    /**
     * 联系方式
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户角色
     */
    @Column(name = "user_role_id")
    private Integer userRoleId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 配置信息
     */
    private String config;

    /**
     * 用户描述
     */
    @Column(name = "user_des")
    private String userDes;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码，加密以后，默认跟账号相同
     *
     * @return password - 密码，加密以后，默认跟账号相同
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码，加密以后，默认跟账号相同
     *
     * @param password 密码，加密以后，默认跟账号相同
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取联系方式
     *
     * @return telephone - 联系方式
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系方式
     *
     * @param telephone 联系方式
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户角色
     *
     * @return user_role_id - 用户角色
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * 设置用户角色
     *
     * @param userRoleId 用户角色
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取配置信息
     *
     * @return config - 配置信息
     */
    public String getConfig() {
        return config;
    }

    /**
     * 设置配置信息
     *
     * @param config 配置信息
     */
    public void setConfig(String config) {
        this.config = config;
    }

    /**
     * 获取用户描述
     *
     * @return user_des - 用户描述
     */
    public String getUserDes() {
        return userDes;
    }

    /**
     * 设置用户描述
     *
     * @param userDes 用户描述
     */
    public void setUserDes(String userDes) {
        this.userDes = userDes;
    }
}