package ru.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.university.entity.Curator;
import ru.university.entity.Group;
import ru.university.entity.Student;
import ru.university.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication(scanBasePackages = "ru.university")
public class ApplicationLauncher {
    public static void main(String [] args){
        SpringApplication.run(ApplicationLauncher.class, args);
    }
}
