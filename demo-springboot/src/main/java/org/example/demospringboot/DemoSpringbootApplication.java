package org.example.demospringboot;

import org.example.demospringboot.model.Alien;
import org.example.demospringboot.model.Laptop;
import org.example.demospringboot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringbootApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(DemoSpringbootApplication.class, args);
        System.out.println("Hello I started Spring !!");

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);

//       Alien obj = context.getBean(Alien.class);
//        obj.code();
    }



}
