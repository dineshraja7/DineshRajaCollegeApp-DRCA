package com.drca.controller;
import com.drca.repository.ProjectRepository;
import com.drca.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info/project")

public class ProjectController {
    @Autowired
    ProjectRepository repository;
    @Autowired
    StudentsRepository studentsRepository;

    @GetMapping("/name/{projectName}")

    String getProjectName(@PathVariable("projectName") final String name, Model model) {
        System.out.println("inside getProjectName method");
        model.addAttribute("projects", repository.findByProjectName(name));
        return "projectDetails";
    }
    @GetMapping("/all")
    String geMethod(Model model) {
        System.out.println("inside getMethod method");
        model.addAttribute("projects", repository.ProjectParticipants());
        return "projectDetails";
    }
    @GetMapping("/id/{projectId}")

    String getProjectId(@PathVariable("projectId") final Integer projectId, Model model) {

        System.out.println("inside getProjectName method");
        model.addAttribute("projectStudents", studentsRepository.findByProjectId(projectId));
        return "projectDetails";
    }
}
