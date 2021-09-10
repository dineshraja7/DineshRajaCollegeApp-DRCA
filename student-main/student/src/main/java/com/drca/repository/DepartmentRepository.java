package com.drca.repository;

import com.drca.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByDepartmentId(int departmentId);
    List<Department> findByDepartmentName(String departmentName);
    //List<Department>findByFacultyId(int facultyId);
    List<Department> findByDepartmentStrength(int departmentStrength );


  @Query(value = "Select dp.department_id,dp.department_name,dp.department_strength,dp.department_location,fy.faculty_first_name,fy.faculty_last_name,fy.subject_handling from department dp inner join faculty fy  on dp.department_id = fy.department_id",nativeQuery = true)
    List<Department> DepartmentDetails();
  @Query(value = "Select dp.department_id,dp.department_name,dp.department_strength,dp.department_location from department dp",nativeQuery = true)
    List<Department>UpdateDepartment();
}




