package com.mindtree.example.model;

public class Employee {

	private String employeeId;

	private String firstName;

	private String lastName;

	private Address empAddress;

	public Employee() {
	}

	public Employee(String employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpAddress() {
		if (empAddress == null) {
			return null;
		}
		return new StringBuffer().append(empAddress.getCity()).append(",").append(empAddress.getCountry()).toString();
	}

	public void setEmpAddress(String empAddressString) {
		if (empAddressString != null && empAddressString.length() == 0) {
			this.empAddress = null;
			return;
		}
		empAddress = new Address();
		empAddress.setStreet(empAddressString);
	}

}
