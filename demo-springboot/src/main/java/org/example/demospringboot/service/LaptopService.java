package org.example.demospringboot.service;

import org.example.demospringboot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo repo;

    public void addLaptop(Laptop lap) {
       repo.save();
    }

    public boolean isGoodForPgramming(){
        return true;
    }
}
