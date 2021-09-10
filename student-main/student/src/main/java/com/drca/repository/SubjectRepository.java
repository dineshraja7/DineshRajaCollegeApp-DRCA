package com.drca.repository;
import com.drca.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    Subject findBySubjectId(int subjectId);
    List<Subject> findBySubjectName(String subjectName);
    List<Subject> findByFacultyId(int facultyId);

    @Query(value = "Select sb.subject_id,sb.subject_name,sb.faculty_id,sb.book_link ,sb.book_name,sb.faculty_first_name,sb.department_name,sb.book_name,sb.subject_description from subject sb",nativeQuery = true)
    List<Subject> SubjectDetails();

    @Query(value = "Select sb.subject_id,sb.subject_name,sb.faculty_id from subject sb",nativeQuery = true)
    List<Subject>SubjectInfo();


}

