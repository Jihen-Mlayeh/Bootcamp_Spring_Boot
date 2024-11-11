package com.Bootcamp.Bootcamp.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class
InMemoryStudentRepository {
    private static final List<Student> students = new ArrayList<>();

    public Student saveInMemory(Student s) {
          students.add(s);
          return s;
    }


    public Student upadteInMemory(Student s) {
        var studentIndex= IntStream.range(0,students.size())
                .filter(index->students.get(index).getId().equals(s.getId())).findFirst().orElse(-1);

            if (studentIndex>-1){
                students.set(studentIndex,s);
                return s;
            }

        return null;
    }


    public Student findByIdInMemory(Integer id) {

      return students.stream().filter(student -> student.getId().
                      equals(id)).
              findFirst().orElse(null);
    }


    public List<Student> findAllInMemory() {
        return students;
    }


    public void deleteInMemory

            (Integer id) {
        students.remove(findByIdInMemory(id));

    }
}
