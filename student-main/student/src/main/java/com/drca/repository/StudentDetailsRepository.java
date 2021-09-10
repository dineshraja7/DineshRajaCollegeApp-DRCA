package com.drca.repository;
import com.drca.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDetailsRepository extends JpaRepository<Student, Integer> {
    List<Student> findByFacultyId(int facultyId);

    @Query(value = "Select sb.subject_id,fy.faculty_first_name,fy.faculty_last_name from faculty fy inner join subject sb on fy.faculty_id = sb.faculty_id",nativeQuery = true)
    List<Student> getStudentDetails(int student_id);
}


