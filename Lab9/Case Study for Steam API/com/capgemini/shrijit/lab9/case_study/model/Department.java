package com.capgemini.shrijit.lab9.case_study.model;

public class Department {

	private Integer departmentId;
	private String departmentName;
	private Integer managerId;
	public Department() {
		super();
	}
	public Department(Integer departmentId, String departmentName, Integer managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Department ID : " + departmentId + "\nDepartment Name : " + departmentName;
	}
	
	
}
