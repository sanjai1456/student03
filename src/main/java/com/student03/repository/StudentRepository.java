package com.student03.repository;

import org.springframework.data.repository.CrudRepository;

import com.student03.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
