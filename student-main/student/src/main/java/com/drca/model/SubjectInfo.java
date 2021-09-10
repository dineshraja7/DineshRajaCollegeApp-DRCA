package com.drca.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject", catalog = "rrd")

public class SubjectInfo {
    @Id int subjectId;
String subjectName;
int facultyId;
String facultyFirstName;
String departmentName;



    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
