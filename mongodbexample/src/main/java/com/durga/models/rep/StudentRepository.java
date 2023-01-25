package com.durga.models.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.durga.models.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
