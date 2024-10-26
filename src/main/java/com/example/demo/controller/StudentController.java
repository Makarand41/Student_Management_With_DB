package com.example.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/students")
public class StudentController {

    private final StudentService studentService;

    // Build create Student REST API
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // Build get student by id REST API
    // http://localhost:8080/api/students/1
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId) {
        Student student = studentService.getStudentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Build Get All Students REST API
    // http://localhost:8080/api/students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Build Update Student REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/students/1
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long studentId,
                                                 @RequestBody Student student) {
        student.setId(studentId);
        Student updatedStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    // Build Delete Student REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("Student successfully deleted!", HttpStatus.OK);
    }
    
    @DeleteMapping
    public ResponseEntity<String> deleteAllStudents() {
        studentService.deleteAllStudents();
        return new ResponseEntity<>("All students successfully deleted!", HttpStatus.OK);
    }
    
    
    @GetMapping("/count")
    public ResponseEntity<Long> countStudents() {
        long count = studentService.countStudents();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }
    
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable("id") Long studentId) {
        boolean exists = studentService.existsById(studentId);
        return new ResponseEntity<>(exists, HttpStatus.OK);
    }
}
