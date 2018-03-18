package com.eservice.api.model;

import javax.persistence.*;

@Table(name = "rb_cmd_template")
public class RbCmdTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 命令的名称
     */
    private String name;

    private String category;

    private Byte type;

    /**
     * 用户显示命令的ＵＩ
     */
    @Column(name = "json_cmd")
    private String json_cmd;

    /**
     * python代码
     */
    @Column(name = "python_cmd")
    private String pythonCmd;

    /**
     * string数组， 以逗号分割
     */
    private String params;

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
     * 获取命令的名称
     *
     * @return name - 命令的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置命令的名称
     *
     * @param name 命令的名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取用户显示命令的ＵＩ
     *
     * @return json_cmd - 用户显示命令的ＵＩ
     */
    public String getJsonCmd() {
        return json_cmd;
    }

    /**
     * 设置用户显示命令的ＵＩ
     *
     * @param jsonCmd 用户显示命令的ＵＩ
     */
    public void setJsonCmd(String jsonCmd) {
        this.json_cmd = jsonCmd;
    }

    /**
     * 获取python代码
     *
     * @return python_cmd - python代码
     */
    public String getPythonCmd() {
        return pythonCmd;
    }

    /**
     * 设置python代码
     *
     * @param pythonCmd python代码
     */
    public void setPythonCmd(String pythonCmd) {
        this.pythonCmd = pythonCmd;
    }

    /**
     * 获取string数组， 以逗号分割
     *
     * @return params - string数组， 以逗号分割
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置string数组， 以逗号分割
     *
     * @param params string数组， 以逗号分割
     */
    public void setParams(String params) {
        this.params = params;
    }
}