package com.security.springSecurity.controller;


import com.security.springSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students=new ArrayList<>(List.of(
            new Student(1,"BINEET PRADHAN",100),
            new Student(2,"DEBLINA JANA",100)
    ));

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return students;
    }

    @GetMapping("/get-csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }


    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student st){
        students.add(st);
        return st;
    }

}
