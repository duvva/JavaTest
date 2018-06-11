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
		employeeBO.setFirstName("Kamal");
		employeeBO.setLastName("Duv");
		employeeBO.setDesignation("Software Developer");
		employeeBO.setEmail("k@gmail.com");
		employeeBO.setMobile("9999999999");

		return employeeBO;
	}
//this method will returns list of employees present in an organistion
	public List<EmployeeBO> getEmployeeList() {

		List<EmployeeBO> employeeBOList=new ArrayList();
		
		EmployeeBO employeeBO = new EmployeeBO();

		employeeBO.setEmployeeId(1);
		employeeBO.setFirstName("Kam");
		employeeBO.setLastName("Dua");
		employeeBO.setDesignation("Software Developer");
		employeeBO.setEmail("kam@gmail.com");
		employeeBO.setMobile("9999999999");
		
		employeeBOList.add(employeeBO);
		
		EmployeeBO employeeBO1 = new EmployeeBO();

		employeeBO1.setEmployeeId(2);
		employeeBO1.setFirstName("Ra");
		employeeBO1.setLastName("Da");
		employeeBO1.setDesignation("Software Developer");
		employeeBO1.setEmail("r@gmail.com");
		employeeBO1.setMobile("9953333333");
		
		employeeBOList.add(employeeBO1);
		
		return employeeBOList;

	}

}
