package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.main.model.Employee;

public interface HomeRepository extends CrudRepository<Employee, Integer>{
	
	public Employee findAllByUsernameAndPassword(String us, String pw);
	
	public Employee findAllById(Integer uid);

}
