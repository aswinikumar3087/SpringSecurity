package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.entity.Laptop;
import com.example.SpringBootDemo.entity.Student;
import com.example.SpringBootDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
   private StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){

        studentRepository.save(student);
    }
    @GetMapping("/addStudentObject")
    public void addStudentObject(){

        Student student1 = new Student();

        Laptop laptop = new Laptop();
        laptop.setLbrand("Sony");
        laptop.setStudent(student1);

        Laptop laptop1 = new Laptop();
        laptop1.setLbrand("Dell");
        laptop1.setStudent(student1);


        student1.setName("A");
        student1.getLaptop().add(laptop);
        student1.getLaptop().add(laptop1);

        studentRepository.save(student1);

        Student S2 = new Student();
        Laptop laptop2 = new Laptop();
        laptop2.setLbrand("Dell");
        laptop2.setStudent(S2);
        S2.setName("T");
        S2.getLaptop().add(laptop2);
        studentRepository.save(S2);

    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudent(@PathVariable("id") Long id){

        Optional<Student> student = studentRepository.findById(id);
        Student student1 = student.get();
        System.out.format("Stid ::Name :: %s %s", student1.getId(), student1.getName());
        return student1;

    }
}
