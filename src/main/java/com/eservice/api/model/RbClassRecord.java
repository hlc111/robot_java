package com.eservice.api.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rb_class_record")
public class RbClassRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_id")
    private Integer classId;

    /**
     * 培训机构ID
     */
    @Column(name = "organization_id")
    private Integer organizationId;

    /**
     * 课程学期
     */
    @Column(name = "class_term")
    private String classTerm;

    /**
     * 课程资料信息,供学生下载学习(这部分内容待定，具体放什么内容）
     */
    @Column(name = "class_info")
    private String classInfo;

    @Column(name = "current_section")
    private Integer currentSection;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "end_time")
    private Date endTime;

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
     * @return class_id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取培训机构ID
     *
     * @return organization_id - 培训机构ID
     */
    public Integer getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置培训机构ID
     *
     * @param organizationId 培训机构ID
     */
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 获取课程学期
     *
     * @return class_term - 课程学期
     */
    public String getClassTerm() {
        return classTerm;
    }

    /**
     * 设置课程学期
     *
     * @param classTerm 课程学期
     */
    public void setClassTerm(String classTerm) {
        this.classTerm = classTerm;
    }

    /**
     * 获取课程资料信息,供学生下载学习(这部分内容待定，具体放什么内容）
     *
     * @return class_info - 课程资料信息,供学生下载学习(这部分内容待定，具体放什么内容）
     */
    public String getClassInfo() {
        return classInfo;
    }

    /**
     * 设置课程资料信息,供学生下载学习(这部分内容待定，具体放什么内容）
     *
     * @param classInfo 课程资料信息,供学生下载学习(这部分内容待定，具体放什么内容）
     */
    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    /**
     * @return current_section
     */
    public Integer getCurrentSection() {
        return currentSection;
    }

    /**
     * @param currentSection
     */
    public void setCurrentSection(Integer currentSection) {
        this.currentSection = currentSection;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}