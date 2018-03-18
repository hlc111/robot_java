package com.eservice.api.model;

import javax.persistence.*;

@Table(name = "rb_class")
public class RbClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名字
     */
    private String name;

    /**
     * JSON格式（[{“name”："命令1"， "value":"self.step(1)"}）
     */
    private String command;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取课程名字
     *
     * @return name - 课程名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名字
     *
     * @param name 课程名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取JSON格式（[{“name”："命令1"， "value":"self.step(1)"}）
     *
     * @return command - JSON格式（[{“name”："命令1"， "value":"self.step(1)"}）
     */
    public String getCommand() {
        return command;
    }

    /**
     * 设置JSON格式（[{“name”："命令1"， "value":"self.step(1)"}）
     *
     * @param command JSON格式（[{“name”："命令1"， "value":"self.step(1)"}）
     */
    public void setCommand(String command) {
        this.command = command;
    }
}