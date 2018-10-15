package ru.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.university.entity.Student;
import ru.university.service.Service;
import ru.university.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController extends AbstractController<Student>{

    @Autowired
    private StudentService studentService;

    @GetMapping("/surname/{surname}")
    public ResponseEntity<List<Student>> getStudentBySurname(@PathVariable String surname) {
        List<Student> studentList = studentService.findBySurname(surname);
        if ( studentList.isEmpty() ) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(studentList, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/group/{id}")
    public ResponseEntity<List<Student>> getStudentByGroup(@PathVariable Long id) {
        List<Student> studentList = studentService.findByGroup(id);
        if ( studentList.isEmpty() ) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(studentList, httpHeaders, HttpStatus.OK);
    }

    @Override
    public Service<Student> getService() {
        return studentService;
    }
}
