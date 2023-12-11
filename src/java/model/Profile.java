/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Profile {
    private String studentid;
    private String firstname;
    private String lastname;
    private String dateofbirth;
    private Integer gender;
    private String address;
    private String email;
    private String phone;
    private String guardianname;
    private String guardianphone;
    private String admissiondate;
    private String field_of_study;
    private String classsection;
    private Integer photoid;

    public Profile() {
    }

    public Profile(String studentid, String firstname, String lastname, String dateofbirth, Integer gender, String address, String email, String phone, String guardianname, String guardianphone, String admissiondate, String field_of_study, String classsection, Integer photoid) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.guardianname = guardianname;
        this.guardianphone = guardianphone;
        this.admissiondate = admissiondate;
        this.field_of_study = field_of_study;
        this.classsection = classsection;
        this.photoid = photoid;
    }

    public Profile(Integer photoid, String studentid, String firstname, String lastname, Integer gender, String admissiondate) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.admissiondate = admissiondate;
        this.photoid = photoid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname;
    }

    public String getGuardianphone() {
        return guardianphone;
    }

    public void setGuardianphone(String guardianphone) {
        this.guardianphone = guardianphone;
    }

    public String getAdmissiondate() {
        return admissiondate;
    }

    public void setAdmissiondate(String admissiondate) {
        this.admissiondate = admissiondate;
    }

    public String getField_of_study() {
        return field_of_study;
    }

    public void setField_of_study(String field_of_study) {
        this.field_of_study = field_of_study;
    }

    public String getClasssection() {
        return classsection;
    }

    public void setClasssection(String classsection) {
        this.classsection = classsection;
    }

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    @Override
    public String toString() {
        return "Profile{" + "studentid=" + studentid + ", firstname=" + firstname + ", lastname=" + lastname + ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", address=" + address + ", email=" + email + ", phone=" + phone + ", guardianname=" + guardianname + ", guardianphone=" + guardianphone + ", admissiondate=" + admissiondate + ", field_of_study=" + field_of_study + ", classsection=" + classsection + ", photoid=" + photoid + '}';
    }

    
}
