package com.ems.util;

import java.util.ArrayList;
import java.util.List;

import com.ems.bo.EmployeeBO;
import com.ems.dto.EmployeeDTO;

import org.springframework.stereotype.Component;
@Component
public class EmployeeConverter {

	public static List<EmployeeDTO> convertDaoListToDtoList(List<EmployeeBO> employeeBOList){
		
		List<EmployeeDTO> employeeDTOList=new ArrayList();
		
		for(EmployeeBO employeeBo : employeeBOList) {
			//converting bo to dto
			EmployeeDTO employeeDto=new EmployeeDTO();
			employeeDto.setEmployeeId(employeeBo.getEmployeeId());
			employeeDto.setFirstName(employeeBo.getFirstName());
			employeeDto.setLastName(employeeBo.getLastName());
			employeeDto.setDesignation(employeeBo.getDesignation());
			employeeDto.setEmail(employeeBo.getEmail());
			employeeDto.setMobile(employeeBo.getMobile());
			employeeDTOList.add(employeeDto); //adds each dto into list
		}
		
		
		return employeeDTOList;
		
	}
	
}
