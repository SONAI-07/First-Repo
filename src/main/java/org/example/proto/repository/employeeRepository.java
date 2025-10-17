package org.example.proto.repository;

import org.springframework.stereotype.Repository;
import org.example.proto.model.employee;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface employeeRepository extends MongoRepository <employee,Long>
{ }