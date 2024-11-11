package com.Bootcamp.Bootcamp.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class InMemoryStudentService implements StudentService{
    private final InMemoryStudentRepository studentRepository;

    @Override
    public Student save(Student s) {

        return studentRepository.saveInMemory(s);
    }

    @Override
    public Student upadte(Student s) {

        return studentRepository.upadteInMemory(s);
    }

    @Override
    public Student findById(Integer id) {

        return studentRepository.findByIdInMemory(id);
    }

    @Override
    public List<Student> findAll() {

        return studentRepository.findAllInMemory();
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteInMemory(id);

    }
}
