package com.drca.repository;

import com.drca.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface subjectInfoRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findBySubjectId(int subjectId);
}
