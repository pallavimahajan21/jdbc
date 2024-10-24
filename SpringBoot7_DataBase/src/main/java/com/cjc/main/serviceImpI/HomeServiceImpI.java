package com.cjc.main.serviceImpI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpI implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Employee e) {
		
		hr.save(e);

	}

	@Override
	public Employee getData(String us, String pw) {
	
		return hr.findAllByUsernameAndPassword(us, pw);
	}

	@Override
	public Iterable<Employee> getAllData() {
	
		return hr.findAll();
	}

	@Override
	public void deleteData(int uid) {
	
		hr.deleteById(uid);
		
	}

	@Override
	public Employee editData(int uid) {
		
		return hr.findAllById(uid);
		
		
	}

	

}
