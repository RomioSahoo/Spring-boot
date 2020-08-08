package com.cognizant.Student.repos;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.Student.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
