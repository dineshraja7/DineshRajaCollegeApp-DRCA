package com.drca.controller;

import com.drca.model.Student;
import com.drca.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;



import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller //Thymeleaf works only with @Controller, not @RestController
@RequestMapping("/info/Student")
public class StudentController {

@Autowired
StudentsRepository repository;






    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Student student, Model model, MultipartFile file) throws IOException {
        List<Student> studentsList = repository.StudentFaculty();
        System.out.println("inside saveStudent method");
        student.setStudentImage(student.getMultipartFile().getBytes());
            repository.save(student);
        for(Student stu:studentsList) {

            if (stu.getStudentImage() != null) {
                stu.setStuImgStr(Base64.getEncoder().encodeToString(stu.getStudentImage()));
            }

        }


        model.addAttribute("students",studentsList);
            return "index";
        }




@GetMapping("/studentFirstName/{studentFirstName}")
String getStudents(@PathVariable("studentFirstName") final String name, Model model){
    System.out.println("inside getStudents method");
    model.addAttribute("students", repository.findByStudentFirstName(name));
    return "index";
}
    @GetMapping("/addStudent")
    String AddStudents(Model model){
        Student stud = new Student();
        System.out.println("inside AddStudents Method");
        model.addAttribute("student",stud);
        return "AddStudent";
    }

    @GetMapping("/UpdateStudent/{studentId}")
    String UpdateStudent( Model model,@PathVariable("studentId") final int studentId,Student students){
        System.out.println("inside updateStudents Method");
        model.addAttribute("student",repository.findByStudentId(studentId));
        return "AddStudent";

    }
    @GetMapping("/deletePage/{studentId}")
    String DeleteStudents(Model model,@PathVariable("studentId")final int studentId){
        System.out.println("inside DeleteStudents Method");
        model.addAttribute("student",repository.findByStudentId(studentId));
        return "AddStudent";
    }









    @RequestMapping("/all") // the maximum
String getList(Model model) {
    List<Student> studentList = repository.StudentFaculty();
    for(Student st:studentList) {
        if (st.getStudentImage() != null) {
            st.setStuImgStr(Base64.getEncoder().encodeToString(st.getStudentImage()));

        }
    }
    System.out.println("inside getList method");
    model.addAttribute("students", studentList);
    return "index";
}



@GetMapping("/specific-name/{name}-{name2}")
String getByName(@PathVariable("name") final String name, @PathVariable("name2") final String name2, Model model){
    System.out.println("inside getStudents method");
   // model.addAttribute("students", repository.findByFirstNameAndLastName(name, name2));
    return "index";

}

    @RequestMapping("/enroll")
    String getMethod(Model model){
        System.out.println("inside getMethod method");
        model.addAttribute("students",repository.StudentFaculty());
        return "index";

    }
    @GetMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") final  int studentId,@ModelAttribute Student student,Model model) {
        repository.deleteById(studentId);
        List<Student> studentsList = repository.StudentFaculty();
        for (Student stu : studentsList) {
            if (stu.getStudentImage() != null) {
                stu.setStuImgStr(Base64.getEncoder().encodeToString(stu.getStudentImage()));
            }

        }
        System.out.println("inside deleteStudent method");
        model.addAttribute("students",studentsList);
        return "index";

    }



    }
