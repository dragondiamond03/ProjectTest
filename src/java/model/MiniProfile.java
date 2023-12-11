/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class MiniProfile {
    private Integer pid;
    private String id;
    private String fullname;
    private Integer sex;
    private String admissiondate;

    public MiniProfile() {
    }

    public MiniProfile(Integer pid, String id, String fullname, Integer sex, String admissiondate) {
        this.pid = pid;
        this.id = id;
        this.fullname = fullname;
        this.sex = sex;
        this.admissiondate = admissiondate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAdmissiondate() {
        return admissiondate;
    }

    public void setAdmissiondate(String admissiondate) {
        this.admissiondate = admissiondate;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "MiniProfile{" + "pid=" + pid + ", id=" + id + ", fullname=" + fullname + ", sex=" + sex + ", admissiondate=" + admissiondate + '}';
    }


    
}
