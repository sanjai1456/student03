package com.student03;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student03.entities.Student;
import com.student03.repository.StudentRepository;

@SpringBootTest
class Student03ApplicationTests {
    
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	void contextLoads() {
		System.out.println(studentRepository);
	}
     
	@Test
	void saveOneStudent() {
		Student student = new Student();
		student.setName("anjali");
		student.setCourse("manager IT openApi");
		student.setFee(22000);
		studentRepository.save(student);
	}
	@Test
	void deleteOneStudent() {
		studentRepository.deleteById(4L);
	}
	@Test
	void updateOneStudent() {
		Student student = new Student();
		student.setId(2);
		student.setName(" mike ");
		student.setCourse("manager IT openApi");
		student.setFee(6000);
		studentRepository.save(student);
	}
	@Test
	void findStudentById() {
		Optional<Student> findById = studentRepository.findById(2L);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}
}
