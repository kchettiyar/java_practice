package com.kchetty.ActuatorPro.Repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kchetty.ActuatorPro.beans.EmployeeBean;

public interface EmployeeRespository extends MongoRepository<EmployeeBean, Serializable> {

	EmployeeBean findByEmail(String email);
}
