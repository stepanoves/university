package ru.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.university.entity.Learning;
import ru.university.entity.Student;
import ru.university.repository.LearningRepository;

import java.util.List;

public class LearningServiceImpl implements LearningService{
    @Autowired
    private LearningRepository repository;

    @Override
    public void deduct(Student student) {
        Learning changeStudent = repository.findByStudent(student);
        changeStudent.setStatus(false);
        this.save(changeStudent);
    }

    @Override
    public void changeCourse(Student student, Integer courseNumber) {
        Learning changeStudent = repository.findByStudent(student);
        changeStudent.setCourse(courseNumber);
        this.save(changeStudent);
    }

    @Override
    public Learning read(Long id) {
        return null;
    }

    @Override
    public List<Learning> read() {
        return null;
    }

    @Override
    public void save(Learning entity) {

    }

    @Override
    public void delete(Learning entity) {

    }
}
