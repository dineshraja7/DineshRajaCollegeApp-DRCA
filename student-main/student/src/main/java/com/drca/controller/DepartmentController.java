package com.drca.controller;

import com.drca.model.Department;
import com.drca.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/info/department")

public class DepartmentController {
    @Autowired
    DepartmentRepository repository;
    @GetMapping("/name/{departmentName}")

    String getDepartment(@PathVariable("departmentName") final String departmentName, Model model){
        System.out.println("inside getDepartment method");
        model.addAttribute("departments", repository.findByDepartmentName(departmentName));
        return "index3";

    }
    @GetMapping("/details/{departmentId}")
    String DepartmentId(@PathVariable("departmentId") final int departmentId, Model model) {
        System.out.println("inside departmentId method");
        model.addAttribute("department",repository.findByDepartmentId(departmentId));
        return "DepartmentDetails";
    }
    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("departments",repository.UpdateDepartment());
        return "index3";
    }
    @GetMapping("/addDepartment")
    String AddDepartment(Model model){
        Department dept = new Department();
        System.out.println("inside AddDepartment Method");
        model.addAttribute("department",dept);
        return "AddDepartment";
    }
    @PostMapping("/saveDepartment")
    public String saveDepartment(@ModelAttribute Department department, Model model,final int departmentId) {
        List<Department> departmentList = repository.UpdateDepartment();
        System.out.println("inside saveDepartment method");
        repository.save(department);
        model.addAttribute("departments",repository.UpdateDepartment());
        return "index3";
    }
    @GetMapping("/deleteDepartment/{departmentId}")
    public String deleteDepartment(@PathVariable("departmentId") final  int departmentId,@ModelAttribute Department department,Model model) {
        repository.deleteById(departmentId);
        List<Department> departmentList = repository.UpdateDepartment();
        System.out.println("inside deleteDepartment method");
        model.addAttribute("departments",departmentList);
        return "index3";

    }


    @GetMapping("/UpdateDepartment/{departmentId}")
    String UpdateDepartment(Model model, @PathVariable("departmentId") final int departmentId) {
        System.out.println("inside updateDepartment Method");
        model.addAttribute("department",repository.findByDepartmentId(departmentId));
        return "AddDepartment";
    }

    }





