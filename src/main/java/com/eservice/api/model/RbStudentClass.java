package com.eservice.api.model;

import javax.persistence.*;

@Table(name = "rb_student_class")
public class RbStudentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "class_record_id")
    private Integer classRecordId;

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
     * @return student_id
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return class_record_id
     */
    public Integer getClassRecordId() {
        return classRecordId;
    }

    /**
     * @param classRecordId
     */
    public void setClassRecordId(Integer classRecordId) {
        this.classRecordId = classRecordId;
    }
}