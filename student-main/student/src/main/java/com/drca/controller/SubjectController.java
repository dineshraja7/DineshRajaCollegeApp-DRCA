package com.drca.controller;


import com.drca.model.Subject;
import com.drca.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/info/subject")

public class SubjectController {
    @Autowired
    SubjectRepository repository;

    @GetMapping("/id/{subjectId}")
    String getSubject(@PathVariable("subjectId") final int subjectId, Model model) {
        System.out.println("inside getSubject method");
        model.addAttribute("subject", repository.findBySubjectId(subjectId));
        return "SubjectDetails";
    }

    @GetMapping("/UpdateSubject/{subjectId}")
    String UpdateSubject(Model model, @PathVariable("subjectId") final int subjectId, Subject subject) {
        System.out.println("inside updateSubject Method");
        model.addAttribute("subject", repository.findBySubjectId(subjectId));
        return "AddSubject";
    };
    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("subjects",repository.SubjectDetails());
        return "index4";
    }
    @PostMapping("/saveSubject")
    public String saveSubject(@ModelAttribute Subject subject, Model model) {
        List<Subject>subjectList = repository.SubjectDetails();
        System.out.println("inside saveSubject method");
        repository.save(subject);
        model.addAttribute("subjects",repository.SubjectDetails());
        return "index4";
    }
    @GetMapping("/addSubject")
    String AddSubject(Model model){
        Subject subj = new Subject();
        System.out.println("inside AddSubject Method");
        model.addAttribute("subject",subj);
        return "AddSubject";
    }
    @GetMapping("/deleteSubject/{subjectId}")
    public String deleteSubject(@PathVariable("subjectId") final  int subjectId,@ModelAttribute Subject subject,Model model) {
        repository.deleteById(subjectId);
        List<Subject> subjectList = repository.SubjectDetails();
        System.out.println("inside deleteSubject method");
        model.addAttribute("subjects",subjectList);
        return "index4";

    }




}
