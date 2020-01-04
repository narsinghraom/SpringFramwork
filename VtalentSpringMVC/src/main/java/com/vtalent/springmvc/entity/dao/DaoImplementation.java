package com.vtalent.springmvc.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.vtalent.springmvc.entity.bean.EmployeeBean;

public class DaoImplementation implements DAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public int insertEmployeeData(EmployeeBean employeeBean) {
		int result = 0;
		Session session = sessionFactory.openSession();
		Object obj= session.save(employeeBean);
		Transaction trans= session.beginTransaction();
		trans.commit();
		if(obj !=null) {
			Integer itr = (Integer)obj;
			result = itr.intValue();
		}
		return result;
	}

}





