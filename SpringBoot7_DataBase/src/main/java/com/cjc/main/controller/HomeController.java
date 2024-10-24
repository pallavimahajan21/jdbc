package com.cjc.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Employee;
import com.cjc.main.serviceI.HomeServiceI;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
		
	}
	
	@RequestMapping("/regpage")
	public String preReg()
	{
		return "register";
	}
	
	@RequestMapping("/reg")
	public String addData(@ModelAttribute Employee e)
	{
		hs.saveData(e);
		return "login";
	}
	
	@RequestMapping("/log")
	public String fetchData(@RequestParam("username") String us, @RequestParam("password") String pw, Model m)
	{
	
		Employee em=hs.getData(us,pw);
		Iterable<Employee> list=hs.getAllData();
		m.addAttribute("data", list);
		
		return "success";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int uid, Model m)
	{
		hs.deleteData(uid);
		Iterable<Employee> list=hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") int uid, Model m)
	{
		Employee e=hs.editData(uid);
		m.addAttribute("data", e);
		return "edit";
	}

	@RequestMapping("/update")
	public String updateData(@ModelAttribute Employee e, Model m)
	{
		hs.saveData(e);
		Iterable<Employee> list=hs.getAllData();
		m.addAttribute("data", list);
		
		return "success";
		
	}

}
