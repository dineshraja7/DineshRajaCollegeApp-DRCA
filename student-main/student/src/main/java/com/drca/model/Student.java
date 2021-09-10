package com.drca.model;


import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table(name = "student", catalog = "rrd")
public class Student {
    @Id int studentId;
    String studentFirstName;

    String studentLastName;
    int age;
    int classYear;
    int facultyId;
    int projectId;

    byte[] studentImage;
    @Transient
    String stuImgStr;
    @Transient
    MultipartFile multipartFile;




//   @Column(name = "subjectId")
 //  int subjectId;
//    String subjectName;

//@Column(name="facultyFirstName")
  //  String facultyFirstName;
//@Column(name="facultyLastName")
  //  String facultyLastName;






    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
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

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
    /*public int getSubjectId() {
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
    }*/

    //public String getFacultyFirstName() {
      //  return facultyFirstName;
    //}

    //public void setFacultyFirstName(String facultyFirstName) {
     //   this.facultyFirstName =facultyFirstName;
    //}

    //public String getFacultyLastName() {
      //  return facultyLastName;
    //}

    //public void setFacultyLastName(String facultyLastName) {
      //  this.facultyLastName = facultyLastName;
    //}
}



