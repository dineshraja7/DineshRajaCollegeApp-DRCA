package com.drca.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "faculty", catalog = "rrd")
public class Faculty {
    @Id
    int facultyId;
    String facultyFirstName;
    String facultyLastName;
    int age;
    String subjectHandling;
    float basicPay;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date startDate;
    int departmentId;
    int subjectId;
    byte[] facultyImage;
    @Transient
    String facImgStr;
    @Transient
    MultipartFile multipartFile;


    //  String departmentName;

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }


    public String getFacultyFirstName() {
        return facultyFirstName;
    }

    public void setFacultyFirstName(String facultyFirstName) {
        this.facultyFirstName = facultyFirstName;
    }

    public String getFacultyLastName() {
        return facultyLastName;
    }

    public void setFacultyLastName(String facultyLastName) {
        this.facultyLastName = facultyLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubjectHandling() {
        return subjectHandling;
    }

    public void setSubjectHandling(String subjectHandling) {
        this.subjectHandling = subjectHandling;
    }

    public float getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(float basicPay) {
        this.basicPay = basicPay;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public byte[] getFacultyImage() {
        return facultyImage;
    }

    public void setFacultyImage(byte[] facultyImage) {
        this.facultyImage = facultyImage;
    }

    public String getFacImgStr() {
        return facImgStr;
    }

    public void setFacImgStr(String facImgStr) {
        this.facImgStr = facImgStr;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
