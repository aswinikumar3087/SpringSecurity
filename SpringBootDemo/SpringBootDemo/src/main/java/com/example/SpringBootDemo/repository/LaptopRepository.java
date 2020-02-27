package com.example.SpringBootDemo.repository;


import com.example.SpringBootDemo.entity.Laptop;
import org.springframework.data.repository.CrudRepository;

public interface LaptopRepository extends CrudRepository<Laptop,Long>{

}
