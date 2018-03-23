package com.ems.service;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.bo.EmployeeBO;
import com.ems.dao.EmployeeDAO;
import com.ems.dto.EmployeeDTO;
import com.ems.util.EmployeeConverter;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;
	public EmployeeDTO getEmployeeDetails() {
		EmployeeBO employeeBo=employeeDao.getEmployeeDetails();
		//convert the Bo object into dto
		EmployeeDTO	employeeDto=new EmployeeDTO();
			employeeDto.setEmployeeId(employeeBo.getEmployeeId());
			employeeDto.setFirstName(employeeBo.getFirstName());
			employeeDto.setLastName(employeeBo.getLastName());
			employeeDto.setDesignation(employeeBo.getDesignation());
			employeeDto.setEmail(employeeBo.getEmail());
			employeeDto.setMobile(employeeBo.getMobile());
		return employeeDto;
	}
	
	
	//gets list of employees
	public List<EmployeeDTO> getEmployeesList(){
		List<EmployeeBO> employeeBOList=employeeDao.getEmployeeList();	
		return EmployeeConverter.convertDaoListToDtoList(employeeBOList);		
	}
}

