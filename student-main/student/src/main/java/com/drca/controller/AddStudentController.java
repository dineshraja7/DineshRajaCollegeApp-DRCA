package com.drca.controller;

import com.drca.model.Student;
import com.drca.repository.AddStudentRepository;
import com.drca.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/info/addStudent")
public class AddStudentController {
    @Autowired
    StudentsRepository repository;
    AddStudentRepository addStudentsRepository;


    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student, BindingResult errors, Model model){
        System.out.println("inside saveStudent method");
        model.addAttribute("students");
        return "AddStudent";
    }

}