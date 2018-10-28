package ru.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.university.entity.Learning;
import ru.university.entity.Student;

public interface LearningRepository extends JpaRepository<LearningRepository, Long> {
    Learning findByStudent(Student student);
}
