package com.example.SpringBootDemo.repository;

import com.example.SpringBootDemo.entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long> {

}
