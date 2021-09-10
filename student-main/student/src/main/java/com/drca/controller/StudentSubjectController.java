package com.drca.controller;


import com.drca.model.StudentSubject;
import com.drca.repository.StudentSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/info/stusub")

public class StudentSubjectController{

    @Autowired
    StudentSubjectRepository repository;
    @GetMapping("/Id/{studentId}")
    String getFirstName(@PathVariable("studentId") final int studentId, Model model) {
        System.out.println("inside getFirstName method");
        //model.addAttribute("stu_subjects", repository.findByStudentId(studentId));
        return "index6";
    }

    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("stu_subjects",repository.findAllDetails());
        return "index6";
    }
    @GetMapping("/enrollment/{studentName}")
    String DepartmentId(@PathVariable("studentName") final int studentMarks, Model model) {
        System.out.println("inside enrollment method");
        model.addAttribute("stu_subject",repository.findByStudentMarks(studentMarks));
        return "StudentStatus";
    }

    @GetMapping("/subjectId/{subjectId}")
    String getSubjectId(@PathVariable("subjectId") final int subjectId, Model model){
        System.out.println("inside subjectId method");
        model.addAttribute("stu_subjects",repository.findBySubjectId(subjectId));
        return "studentDetails";
    }
    @GetMapping("/UpdateMarks/{studentMarks}")
    String UpdateDepartment(Model model, @PathVariable("studentMarks") final int studentMarks) {
        System.out.println("inside updateMarks Method");
        model.addAttribute("stu_subject",repository.findByStudentMarks(studentMarks));
        return "AddMarks";
    }
    @PostMapping("/saveMarks")
    public String saveMarks(@ModelAttribute StudentSubject studentSubject, Model model, final int studentMarks) {
        List<StudentSubject> markList = repository.findAllDetails();
        System.out.println("inside saveMarks method");
        repository.save(studentSubject);
        model.addAttribute("stu_subjects",repository.findAllDetails());
        return "index6";
    }
}
