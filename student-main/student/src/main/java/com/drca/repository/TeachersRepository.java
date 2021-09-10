package com.drca.repository;


import com.drca.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeachersRepository extends JpaRepository<Teacher, Integer> {
    List<Teacher> findByFirstName(String firstName);

    //@Query(value = "Select st.first_name,st.last_name,st.age,st.class_year,sb.subject_name,fy.first_name ,dp.department_name from student st inner join subject sb on st.faculty_id = sb.faculty_id inner join stu_subject ss on st.student_id = ss.student_id inner join faculty fy on st.faculty_id = fy.faculty_id inner join department dp on fy.department_id = dp.department_id",nativeQuery = true)
    List<Teacher>findAll();

}
