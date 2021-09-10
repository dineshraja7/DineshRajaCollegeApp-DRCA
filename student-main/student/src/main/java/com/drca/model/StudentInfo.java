package com.drca.model;
import lombok.Data;


import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
@Data
public class StudentInfo {
    String studentFirstName;
    String studentLastName;
    int studentId;
    int classYear;
   int subjectId;
    int age;
    String subjectName;
    int departmentId;
    String departmentName;
    int departmentStrength;
    String departmentLocation;
    String facultyFirstName;
    int facultyId;
    String facultyLastName;
    String projectName;
    String projectDescription;
    LocalDate startDate;
    LocalDate endDate;
    String projectStatus;
    int projectId;
    byte[] studentImage;
    @Transient
    String stuImgStr;



    List<Subject> stuSubjects = new ArrayList<>();
    List<Department>depList = new ArrayList<>();
    List<Project>stuList = new ArrayList<>();


    public List<Subject> getStuSubjects() {
        return stuSubjects;
    }

    public void setStuSubjects(List<Subject> stuSubjects) {
        this.stuSubjects = stuSubjects;
    }

    public List<Department> getDepList() {
        return depList;
    }

    public void setDepList(List<Department> depList) {
        this.depList = depList;
    }

    public List<Project> getStuList() {
        return stuList;
    }

    public void setStuList(List<Project> stuList) {
        this.stuList = stuList;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentStrength() {
        return departmentStrength;
    }

    public void setDepartmentStrength(int departmentStrength) {
        this.departmentStrength = departmentStrength;
    }

    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }

    public String getFacultyFirstName() {
        return facultyFirstName;
    }

    public void setFacultyFirstName(String facultyFirstName) {
        this.facultyFirstName = facultyFirstName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyLastName() {
        return facultyLastName;
    }

    public void setFacultyLastName(String facultyLastName) {
        this.facultyLastName = facultyLastName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public byte[] getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(byte[] studentImage) {
        this.studentImage = studentImage;
    }

    public String getStuImgStr() {
        return stuImgStr;
    }

    public void setStuImgStr(String stuImgStr) {
        this.stuImgStr = stuImgStr;
    }
}
