package com.drca.controller;
import com.drca.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/info/subjectInfo")
public class SubjectInfoController {
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    com.drca.repository.subjectInfoRepository subjectInfoRepository;


    @GetMapping("/subject/{subjectId}")
    String getSubjectId(@PathVariable("subjectId") final int subjectId, Model model){
        System.out.println("inside subjectId method");
        model.addAttribute("subjects",subjectRepository.findBySubjectId(subjectId));
        return "subjectInfo";
    }
    @GetMapping("/all")
    String getAll(Model model){
     System.out.println("inside getAll method");
     return "subjectInfo";
    }

}

