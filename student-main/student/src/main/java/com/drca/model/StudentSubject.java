package com.drca.model;
import javax.persistence.*;

@Entity
@Table(name = "stu_subject", catalog = "rrd")

public class StudentSubject {

    @Id
    int stuSubId;
    @Column(name = "subjectId")
    int subjectId;
    int studentId;
    int studentMarks;
    String studentsResult;
    String studentName;
    String subjectName;


    public int getStuSubId() {
        return stuSubId;
    }

    public void setStuSubId(int stuSubId) {
        this.stuSubId = stuSubId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}