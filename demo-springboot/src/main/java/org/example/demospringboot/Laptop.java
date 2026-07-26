package org.example.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu cpu1;
    public void compile(){

        cpu1.work();
        System.out.println("Compiling...");
    }
}
