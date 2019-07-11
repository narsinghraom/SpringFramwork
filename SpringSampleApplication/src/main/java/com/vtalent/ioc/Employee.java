package com.vtalent.ioc;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private HR hr;
	private List<String> skillSet;
	
	
	
	
	/**
	 * @return the skillSet
	 */
	public List<String> getSkillSet() {
		return skillSet;
	}
	/**
	 * @param skillSet the skillSet to set
	 */
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	/**
	 * @return the hr
	 */
	public HR getHr() {
		return hr;
	}
	/**
	 * @param hr the hr to set
	 */
	public void setHr(HR hr) {
		this.hr = hr;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeSalary
	 */
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

}
