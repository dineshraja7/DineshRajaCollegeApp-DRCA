package com.drca.repository;
import com.drca.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findByProjectId(int projectId);
    List<Project>findByProjectName(String projectName);
    List<Project>findByProjectStatus(String projectStatus);

    @Query(value = "Select st.student_id,st.student_first_name, pj.project_id,pj.project_name,pj.project_status,pj.end_date,pj.project_description,pj.start_date from student st inner join project pj on st.project_id = pj.project_id ;",nativeQuery = true)
    List<Project>findProjectDetails();
    @Query(value = "Select st.student_first_name,st.student_last_name,st.class_year from student st inner join project pj on st.project_id = pj.project_id;",nativeQuery = true)
    List<Project>ProjectParticipants();
}
