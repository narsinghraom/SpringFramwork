package com.vtalent.springmvc.entity.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vtalent.springmvc.entity.bean.EmployeeBean;
import com.vtalent.springmvc.entity.dao.DAO;

public class VtalentServiceImplementation implements VtalentService {

	@Autowired
	DAO dao;
	public int insertEmployeeData(EmployeeBean employeeBean) {
		
		return dao.insertEmployeeData(employeeBean);
	}

}
