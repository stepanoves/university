package ru.university.service;

import ru.university.entity.Student;

import java.util.List;

public interface StudentService extends Service<Student> {

    List<Student> findByGroup(Long id);

    List<Student> findBySurname(String name);
}
