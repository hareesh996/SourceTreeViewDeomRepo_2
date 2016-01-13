package com.mindtree.example.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mindtree.example.dto.EmployeeDto;
import com.mindtree.example.model.Employee;


@Mapper
public interface EmployeeMapper {
	
	@Mappings({
		@Mapping(source="employeeId",target="employeeId"),
		@Mapping(source="firstName",target="firstName"),
		@Mapping(source="lastName",target="lastName"),
		@Mapping(source="empAddress",target="address")
	})
	public abstract EmployeeDto modelToDto(Employee employee);
	
	@InheritInverseConfiguration
	public abstract Employee dtoToModel(EmployeeDto employeeDto);
	
	
}
