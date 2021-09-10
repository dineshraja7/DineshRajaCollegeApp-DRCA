package com.drca.controller;
import com.drca.model.*;
import com.drca.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Base64;
import java.util.Optional;

import java.util.List;

@Controller
@RequestMapping("/info/studentDetails")
public class StudentDetailsController {

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    StudentSubjectRepository studentSubjectRepository;

    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    FacultyRepository facultyRepository;
    @Autowired
    ProjectRepository projectRepository;


    @GetMapping("/details/{student_id}")
    String getList(@PathVariable("student_id") final int student_id, Model model) {
        StudentInfo studentInfo = new StudentInfo();
        //1 step
        Optional<Student> student = studentsRepository.findByStudentId(student_id);
        Student st = student.get();
        Faculty fy = facultyRepository.findByFacultyId(st.getFacultyId());
        Department dp = departmentRepository.findByDepartmentId(fy.getDepartmentId());
        List<Project> projects = projectRepository.findByProjectId(st.getProjectId());
        Project pj = projects.get(0);
        List<Student> studentList = studentsRepository.StudentFaculty();



            //List<StudentSubject>stu = studentSubjectRepository.findBySubjectId(st.getStudentId());
            //StudentSubject sd = stu.get(0);
            //List<Subject> subject = subjectRepository.findBySubjectId(sd.getSubjectId());
            //Subject sb = subject.get(0);
            //List<Faculty>fac = facultyRepository.findByFacultyId(sb.getFacultyId());
            //Faculty fc = fac.get(0);

            //List<Department>depName = departmentRepository.findByDepartmentName(dp.getDepartmentName());


            //2nd step

            studentInfo.setStuImgStr(Base64.getEncoder().encodeToString(st.getStudentImage()));

            studentInfo.setStudentId(st.getStudentId());
            studentInfo.setStudentFirstName(st.getStudentFirstName());
            studentInfo.setStudentLastName(st.getStudentLastName());
            studentInfo.setAge(st.getAge());
            studentInfo.setClassYear(st.getClassYear());
            studentInfo.setDepartmentId(dp.getDepartmentId());
            studentInfo.setDepartmentName(dp.getDepartmentName());
            studentInfo.setDepartmentLocation(dp.getDepartmentLocation());
            studentInfo.setDepartmentStrength(dp.getDepartmentStrength());
            studentInfo.setFacultyFirstName(fy.getFacultyFirstName());
            studentInfo.setProjectName(pj.getProjectName());
            studentInfo.setProjectDescription(pj.getProjectDescription());
            studentInfo.setStartDate(pj.getStartDate());
            studentInfo.setEndDate(pj.getEndDate());
            studentInfo.setProjectStatus(pj.getProjectStatus());
            studentInfo.setProjectId(pj.getProjectId());



        //3 step
        List<StudentSubject> studentSubjectList = studentSubjectRepository.findByStudentId(student_id);


        //List<Faculty>fac = facultyRepository.findByFacultyId(sb.getFacultyId());
        //Faculty fc = fac.get(0);
        // List<Department>departmentList = departmentRepository.findByFacultyId(dp.getFacultyId());

        //4 step
        for (StudentSubject ss : studentSubjectList) {


            //5 step
            Subject subList = subjectRepository.findBySubjectId(ss.getSubjectId());


            //6 step
            String subjName = subList.getSubjectName();
            Integer subjectId = subList.getSubjectId();
            Integer studentMarks = ss.getStudentMarks();
            String studentResult = ss.getStudentsResult();

            Faculty fc = facultyRepository.findByFacultyId(subList.getFacultyId());

            //List<StudentSubject>stud = studentSubjectRepository.findByStuSubId(ss.getStuSubId());
            //StudentSubject sj = stud.get(0);

            //7step
            Subject subs = new Subject();
            subs.setSubjectName(subjName);
            subs.setSubjectId(subjectId);
            subs.setFacFirstName(fc.getFacultyFirstName());
            subs.setFacLastName(fc.getFacultyLastName());
            subs.setStudentMarks(studentMarks);
            subs.setStudentsResult(studentResult);
            //8step
            studentInfo.getStuSubjects().add(subs);


        }



        Department dep = new Department();
        String depsName = dep.getDepartmentName();
        dep.setDepartmentName(depsName);




        //9 step
        model.addAttribute("studentInfo", studentInfo);
        System.out.println("inside getList method");
        return "StudentDetails";


        //for (Student s : studentDetailsList) {
        //  Subject sub = new Subject();
        //sub.setSubjectName(s.getSubjectName());
        //sub.setSubjectId(s.getSubjectId());
        //studentInfo.getStuSubjects().add(sub);
        //}

        //model.addAttribute("studentInfo",studentInfo);
        //System.out.println("inside getList method");
        //model.addAttribute("students", repository.getStudentDetails(student_id));
        // return "StudentDetails";
        //}
    }

    @GetMapping("/all")
    String getList(Model model) {
        System.out.println("inside getList method");
        return "projectDetails";
    }
    @GetMapping("/subject_id/{subject_id}")
    String getSubjectId(@PathVariable("subject_id") final int subject_id, Model model){
        System.out.println("inside subjectId method");
        model.addAttribute("stu_subjects",studentSubjectRepository.findBySubjectId(subject_id));
        return "StudentDetails";
    }
}
