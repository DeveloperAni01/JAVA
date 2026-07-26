package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setRollNo(10);
        s1.setSname("Sayon");
        s1.setAge(24);

        Student s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();



//        SessionFactory sf = cfg.buildSessionFactory();

        //connection configuration
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();


        //create session
        Session session = sf.openSession();
        //create transaction
        //Transaction transaction = session.beginTransaction(); //transaction not needed in fetching data but must needed in create, update

        //create
       // session.persist(s1);

        //HQL
        Query query = session.createQuery("from Student where sname='Sayon'", Student.class);

       List<Student> students= query.getResultList();

        //read
       //s2 = session.find(Student.class,10);

        //update
        //session.merge(s1);

        //delete
        //session.remove(s2);

        //transaction.commit();

        session.close();
        sf.close();

        System.out.println(students);
    }
}
