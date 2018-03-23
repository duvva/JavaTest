package com.ems.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.dto.EmployeeDTO;
import com.ems.service.EmployeeService;

@Controller
public class EmployeeController implements org.springframework.web.servlet.mvc.Controller {
	@Autowired
	EmployeeService employeeService;
	//one meployee
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		EmployeeDTO employeeDto=employeeService.getEmployeeDetails();
		ModelAndView mav=new ModelAndView();
		mav.addObject("employee", employeeDto);
		mav.setViewName("empDetails");
		return mav;
	}
}
