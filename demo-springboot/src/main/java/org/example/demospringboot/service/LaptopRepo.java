package org.example.demospringboot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(){
        System.out.println("saved in db");
    }

}
