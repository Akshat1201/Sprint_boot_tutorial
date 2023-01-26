package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Pojo.studentPojo;
@Repository
public interface studentRepo extends CrudRepository<studentPojo, Integer> {

}
