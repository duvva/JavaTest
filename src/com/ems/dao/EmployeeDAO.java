package com.ems.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ems.bo.EmployeeBO;

@Component
public class EmployeeDAO {

	public EmployeeBO getEmployeeDetails() {
		// logic to connect to db and get the details
		EmployeeBO employeeBO = new EmployeeBO();

		employeeBO.setEmployeeId(1);
		employeeBO.setFirstName("Kamalakar");
		employeeBO.setLastName("Duvva");
		employeeBO.setDesignation("Software Developer");
		employeeBO.setEmail("kamhlakarduvva@gmail.com");
		employeeBO.setMobile("9999999999");

		return employeeBO;
	}
//this method will returns list of employees present in an organistion
	public List<EmployeeBO> getEmployeeList() {

		List<EmployeeBO> employeeBOList=new ArrayList();
		
		EmployeeBO employeeBO = new EmployeeBO();

		employeeBO.setEmployeeId(1);
		employeeBO.setFirstName("Kamalakar");
		employeeBO.setLastName("Duvva");
		employeeBO.setDesignation("Software Developer");
		employeeBO.setEmail("kamhlakarduvva@gmail.com");
		employeeBO.setMobile("9999999999");
		
		employeeBOList.add(employeeBO);
		
		EmployeeBO employeeBO1 = new EmployeeBO();

		employeeBO1.setEmployeeId(2);
		employeeBO1.setFirstName("Rajendra");
		employeeBO1.setLastName("Dava");
		employeeBO1.setDesignation("Software Developer");
		employeeBO1.setEmail("rajendra.prasad@gmail.com");
		employeeBO1.setMobile("9959330516");
		
		employeeBOList.add(employeeBO1);
		
		return employeeBOList;

	}

}
