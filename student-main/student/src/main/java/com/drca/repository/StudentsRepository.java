package com.drca.repository;

import com.drca.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
    List<Student> findByStudentFirstName(String studentFirstName);
    Optional<Student> findByStudentId(int student_id);
   // List<Student> findByFacultyId(int facultyId);
    List<Student>findByProjectId(int project_id);

    @Query(value = "Select st.student_id,st.student_first_name,st.student_last_name,st.age,st.class_year,st.faculty_id,st.project_id,st.student_image from student st ",nativeQuery = true)
    List<Student>StudentFaculty();



}


