package services;

import models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentManager {
    void init();
    Student findById(String id);
    List<Student> findByName (String name);
    List<Student> getListStudent();
    Student editInformation(Student student);
}
