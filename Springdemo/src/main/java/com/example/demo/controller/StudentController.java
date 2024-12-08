package com.example.demo.controller;

import com.example.demo.Response;
import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentServices;
    @GetMapping("/student/{id}")
    public Response<StudentDTO> getUserById(@PathVariable long id){
        return Response.newSuccess(studentServices.getStudentById(id));
    }
}
