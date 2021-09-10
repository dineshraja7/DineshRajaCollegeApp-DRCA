package com.drca.controller;

import com.drca.model.Faculty;
import com.drca.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping("/info/faculty")


public class FacultyController {

    @Autowired
    FacultyRepository repository;

    @GetMapping("/name/{facultyFirstName}")
    String getFirstName(@PathVariable("facultyFirstName") final String facultyFirstName, Model model) {
        System.out.println("inside getFirstName method");
        model.addAttribute("faculty", repository.findByFacultyFirstName(facultyFirstName));
        return "FacultyDetails";
    }
    @GetMapping("/UpdateFaculty/{facultyId}")
    String UpdateStudent( Model model,@PathVariable("facultyId") final int facultyId,Faculty faculty){
        System.out.println("inside updateFaculty Method");
        model.addAttribute("faculty",repository.findByFacultyId(facultyId));
        return "AddFaculty";

    }

    @RequestMapping("/all")
    String getList(Model model){
        List<Faculty> facultyList = repository.FacultyDetails();
        for(Faculty fy:facultyList){
            if (fy.getFacultyImage() != null) {
                fy.setFacImgStr(Base64.getEncoder().encodeToString(fy.getFacultyImage()));
            }
        }
        System.out.println("inside getList method");
        model.addAttribute("faculties",facultyList);
        return "index5";
    }
    @GetMapping("/addFaculty")
    String AddFaculty(Model model){
        Faculty fac = new Faculty();
        System.out.println("inside AddFaculty Method");
        model.addAttribute("faculty",fac);
        return "AddFaculty";
    }
    @RequestMapping(value = "/saveFaculty",method = RequestMethod.POST)
    public String saveFaculty(@ModelAttribute Faculty faculty, Model model)throws IOException {
        List<Faculty> FacultyList = repository.FacultyUpdate();
        faculty.setFacultyImage(faculty.getMultipartFile().getBytes());
        System.out.println("inside saveFaculty method");
        repository.save(faculty);
        for(Faculty fac:FacultyList) {
            if (fac.getFacultyImage() != null) {
                fac.setFacImgStr(Base64.getEncoder().encodeToString(fac.getFacultyImage()));
            }
        }
        model.addAttribute("faculties",repository.FacultyDetails());
        return "index5";
    }
    @GetMapping("/deleteFaculty/{facultyId}")
    public String deleteFaculty(@PathVariable("facultyId") final  int facultyId,@ModelAttribute Faculty faculty,Model model) {
        repository.deleteById(facultyId);
        List<Faculty> facultyList = repository.FacultyUpdate();
        for (Faculty fac : facultyList) {
            if (fac.getFacultyImage() != null) {
                fac.setFacImgStr(Base64.getEncoder().encodeToString(fac.getFacultyImage()));
            }

        }
        System.out.println("inside deleteFaculty method");
        model.addAttribute("faculties", facultyList);
        return "index5";
    }
}

