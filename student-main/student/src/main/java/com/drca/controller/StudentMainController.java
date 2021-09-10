package com.drca.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/info/studentMain")
public class StudentMainController {
    @GetMapping("/all")
    String getList(Model model) {
        System.out.println("inside getList method");
        return "studentMain";
    }
}
