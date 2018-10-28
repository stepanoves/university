package ru.university.service;

import ru.university.entity.Learning;
import ru.university.entity.Student;

public interface LearningService extends Service<Learning>{
    void deduct(Student student);
    void changeCourse(Student student, Integer courseNumber);
}
