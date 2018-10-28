package ru.university.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Learning extends AbstractEntity implements Serializable {
    private Boolean status;
    private Integer course;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "learning")
    private Student students;

    public Learning() {
    }

    public Learning(Long id, Boolean status, Integer course, Student students) {
        super(id);
        this.status = status;
        this.course = course;
        this.students = students;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }
}
