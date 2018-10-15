package ru.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.university.entity.Student;
import ru.university.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findByGroup(Long id) {
        return studentRepository.findByGroup_id(id);
    }

    @Override
    public List<Student> findBySurname(String name) {
        return studentRepository.findBySurname(name);
    }

    @Override
    public Student read(Long id) {
        return studentRepository.getOne(id);
    }

    @Override
    public List<Student> read() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student entity) {
        studentRepository.save(entity);
    }

    @Override
    public void delete(Student entity) {
        studentRepository.delete(entity);
    }
}
