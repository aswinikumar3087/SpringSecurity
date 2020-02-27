package com.example.SpringBootDemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long lid;
    private String lbrand;

    @ManyToOne
    Student student;

}
