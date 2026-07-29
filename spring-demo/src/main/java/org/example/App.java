package org.example;


import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
//        obj1.setAge(21);

        System.out.println(obj1.getAge());

        obj1.code();

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();






//        //create spring container
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj = context.getBean(Alien.class);
//
//        System.out.println(obj.getAge());
//        obj.code();
//
//        //obj.code();
//        //Alien obj1 = context.getBean(Alien.class);


    }
}
