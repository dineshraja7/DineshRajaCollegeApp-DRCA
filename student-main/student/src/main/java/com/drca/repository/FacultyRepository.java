package com.drca.repository;

import com.drca.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Date;
import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
    Faculty findByFacultyId(int facultyId);
    Faculty findByFacultyFirstName(String facultyFirstName);
    List<Faculty> findByFacultyLastName(String facultyLastName );
    List<Faculty> findByAge(int age );
    List<Faculty> findBySubjectHandling(String subjectHandling );
    List<Faculty> findByBasicPay(float basicPay );
    List<Faculty> findByStartDate(Date startDate );
    List<Faculty> findByDepartmentId(int departmentId );
    List<Faculty>findBySubjectId(int subjectId);


  @Query(value = "Select fy.subject_id, fy.faculty_id,fy.faculty_first_name,fy.faculty_last_name,fy.age,fy.subject_handling,fy.basic_pay,fy.start_date,fy.department_id,dp.department_name,fy.faculty_image from faculty fy inner join department dp on fy.department_id = dp.department_id",nativeQuery = true)
  List<Faculty>FacultyDetails();

  @Query(value = "Select fy.faculty_id,fy.subject_id,fy.faculty_first_name,fy.faculty_last_name,fy.age,fy.subject_handling,fy.basic_pay,fy.start_date,fy.department_id,fy.faculty_image from faculty fy",nativeQuery = true)
List<Faculty>FacultyUpdate();
}

