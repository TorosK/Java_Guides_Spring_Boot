package com.example.java_guides_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // GET HTTP method
    // http://localhost:8080/get_student
    @GetMapping("/get_student")
    public Student getStudent() {
        return new Student("Toros", "K");
    }

    // http://localhost:8080/get_all_students
    @GetMapping("/get_all_students")
    public List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(new Student("Toros", "K"));
        allStudents.add(new Student("Lisa", "D"));
        allStudents.add(new Student("Niklas", "U"));
        allStudents.add(new Student("Julius", "T"));
        allStudents.add(new Student("Lukas", "X"));
        allStudents.add(new Student("Niklas", "J"));
        allStudents.add(new Student("Henning", "O"));

        return allStudents;
    }

    // http://localhost:8080/toros/k
    @GetMapping("/{firstName}/{lastName}")
    public Student getStudentByFullName(@PathVariable("firstName") String firstName,
                                        @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

}
