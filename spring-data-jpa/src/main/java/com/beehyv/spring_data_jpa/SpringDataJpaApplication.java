package com.beehyv.spring_data_jpa;

import com.beehyv.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {


		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);

StudentRepo repo =context.getBean(StudentRepo.class);


		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);
//
//		s1.setMarks(101);
//		s1.setRollno(25);
//		s1.setName("Navin");
//
//		s2.setMarks(102);
//		s2.setRollno(80);
//		s2.setName("Kiran");
//
//		s3.setMarks(103);
//		s3.setRollno(70);
//		s3.setName("Harsh");
//
//
//		repo.save(s1);
//		    repo.save(s2);
//			      repo.save(s3);

//Optional<Student> s=repo.findById(70);//it fetches data from the table and uses optional class whereas to return null if id is not present in table
//	System.out.println(s.orElse(new Student()));

		     System.out.println(repo.findByName("Navin"));
			    System.out.println(repo.findByMarks(101));
		               System.out.println(repo.findByMarksGreaterThan(101));


	}

}
