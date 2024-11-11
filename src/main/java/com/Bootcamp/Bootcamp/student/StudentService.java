package com.Bootcamp.Bootcamp.student;

import java.util.List;

public interface StudentService {
    Student save(Student s);
    Student upadte(Student s);
    Student findById(Integer id);
    List<Student> findAll();
    void delete(Integer id);
}
