package com.example.demo.service;

import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDTO;

public interface StudentService {
    public StudentDTO getStudentById(long id);
}
