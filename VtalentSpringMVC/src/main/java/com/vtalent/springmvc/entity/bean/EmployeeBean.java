package com.vtalent.springmvc.entity.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employeeTable")
public class EmployeeBean {
	
	@Column(name="employeeId")
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeDOB;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}
	

}
