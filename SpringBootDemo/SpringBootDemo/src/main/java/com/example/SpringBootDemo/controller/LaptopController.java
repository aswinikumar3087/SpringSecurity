package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.entity.Laptop;
import com.example.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    LaptopRepository laptopRepository;

    @GetMapping("/addAllLaptops")
    public void addLaptops(){

        Laptop laptop = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();

       // laptop.setLbrand("Dell");
      //  laptop2.setLbrand("Sony");
     //   laptop3.setLbrand("Asus");

        laptopRepository.save(laptop);
        laptopRepository.save(laptop2);
        laptopRepository.save(laptop3);

    }
@GetMapping("/getLaptopById")
    public Laptop getLaptopById(@PathVariable("id") Long id){
        Optional<Laptop> laptopById = laptopRepository.findById(id);
        return laptopById.get();
    }
}
