package com.Bootcamp.Bootcamp.student;


import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService service;

    public StudentController(    @Qualifier("DBStudentService")
                                 StudentService service) {
        this.service = service;
    }

    @PostMapping()
    public Student save(
            @RequestBody Student s
    ){
        return service.save(s);
    }
    @PutMapping()
    public Student update(
            @RequestBody Student s
    ){
        return service.upadte(s);
    }
    @GetMapping()
    public List<Student> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Student findById(
            @PathVariable("id") Integer id
    ){
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable("id") Integer id
    ){
        service.delete(id);
    }

}
