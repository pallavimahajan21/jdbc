package com.cjc.main.serviceI;


import com.cjc.main.model.Employee;


public interface HomeServiceI {

	public void saveData(Employee e);

	public Employee getData(String us, String pw);

	public Iterable<Employee> getAllData();

	public void deleteData(int uid);

	public Employee editData(int uid);

}
