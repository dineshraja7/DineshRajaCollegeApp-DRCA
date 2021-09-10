package com.drca.repository;

import com.drca.model.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Integer> {
    List<StudentSubject> findBySubjectId(int subjectId);
    List<StudentSubject>findByStudentId(int studentId);
    StudentSubject findByStudentName(String studentName);
    List<StudentSubject>findByStuSubId(int stuSubId);
    StudentSubject findByStudentMarks(int studentMarks);




    @Query(value = "select ss.stu_sub_id,ss.subject_id,ss.student_id,ss.student_marks,ss.students_result,ss.student_name,ss.subject_name from stu_subject ss ",nativeQuery = true)
    List<StudentSubject>findAllDetails();






}