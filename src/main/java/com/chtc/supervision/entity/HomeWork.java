package com.chtc.supervision.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 课程表
 */
@Entity
@Table(name = "homework")
public class HomeWork extends BaseEntity implements java.io.Serializable {

    //作业id
    @Id
    private String id;

    //作业标题
    private  String title;

    //作业内容
    private String workContext;

    //作业创建时间
    private Date createDate;

    //作业创建者id
    private String createBy;

    //作业修改时间
    private Date updateDate;

    //作业修改者id
    private String updateBy;

    //作业所属者
    @JoinColumn(name = "student_id")
    private User student;

    //作业查看老师
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkContext() {
        return workContext;
    }

    public void setWorkContext(String workContext) {
        this.workContext = workContext;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String getCreateBy() {
        return createBy;
    }

    @Override
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public Date getUpdateDate() {
        return updateDate;
    }

    @Override
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String getUpdateBy() {
        return updateBy;
    }

    @Override
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
}
