package com.drca.repository;

import com.drca.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AddStudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "Select st.student_id,st.student_first_name,st.student_last_name,st.age,st.faculty_id from student st", nativeQuery = true )
    List<Student> findAll();

}
