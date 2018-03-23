package com.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.ems.dto.EmployeeDTO;
import com.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class GetAllEmployeesController implements org.springframework.web.servlet.mvc.Controller{
	@Autowired
	private EmployeeService employeeService;
	//all employees
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		List<EmployeeDTO> employeeList = employeeService.getEmployeesList();

		ModelAndView mav = new ModelAndView();
		mav.addObject("employees", employeeList);
		mav.setViewName("getAllEmployees");
		return mav;
	}

	
	
}
