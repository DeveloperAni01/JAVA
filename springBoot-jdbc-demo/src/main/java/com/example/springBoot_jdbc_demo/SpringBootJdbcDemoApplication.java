package com.example.springBoot_jdbc_demo;

import com.example.springBoot_jdbc_demo.model.Student;
import com.example.springBoot_jdbc_demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringBootJdbcDemoApplication.class, args);

		Student st = context.getBean(Student.class);

		st.setRollNo(104);
		st.setName("Ani");
		st.setMarks(93);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(st);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
