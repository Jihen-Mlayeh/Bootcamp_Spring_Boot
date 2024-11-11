package com.Bootcamp.Bootcamp.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DBStudentService implements StudentService{
    private final StudentRepository studentRepository;

    @Override
    public Student save(Student s) {

        return studentRepository.save(s);
    }

    @Override
    public Student upadte(Student s) {


        return studentRepository.save(s);
    }

    @Override
    public Student findById(Integer id) {

        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);

    }
}
