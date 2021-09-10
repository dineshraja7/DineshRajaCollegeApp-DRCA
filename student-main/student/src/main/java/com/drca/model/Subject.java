package com.drca.model;
import javax.persistence.*;

@Entity
@Table(name = "subject", catalog = "rrd")
public class Subject {
    @Id
    @Column(name = "subjectId")
    int subjectId;
    String subjectName;
    int facultyId;
    @Transient
    int age;
    @Transient
    String facFirstName;
    @Transient
    String facLastName;
    @Transient
    int studentMarks;
    @Transient
    String studentsResult;
    String facultyFirstName;
    String departmentName;
    String bookName;
    String subjectDescription;
    String bookLink;



    //int age;
    //int classYear;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFacFirstName() {
        return facFirstName;
    }

    public void setFacFirstName(String facFirstName) {
        this.facFirstName = facFirstName;
    }

    public String getFacLastName() {
        return facLastName;
    }

    public void setFacLastName(String facLastName) {
        this.facLastName = facLastName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public String getStudentsResult() {
        return studentsResult;
    }

    public void setStudentsResult(String studentsResult) {
        this.studentsResult = studentsResult;
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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getBookLink() {
        return bookLink;
    }

    public void setBookLink(String bookLink) {
        this.bookLink = bookLink;
    }
    /*public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }*/

}
