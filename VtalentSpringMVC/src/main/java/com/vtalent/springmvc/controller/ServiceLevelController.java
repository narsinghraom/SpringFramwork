package com.vtalent.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vtalent.springmvc.entity.bean.EmployeeBean;
import com.vtalent.springmvc.entity.service.VtalentService;

@Controller
public class ServiceLevelController {
	@Autowired
	VtalentService service;
	
	@RequestMapping(value = "EmployeeFormRequest",method = RequestMethod.POST)
	public ModelAndView readEmployeeFormPage(@ModelAttribute("employeeObj") EmployeeBean employeeBean) {
		int result =0;
		ModelAndView modelAndViewRef = new ModelAndView();
		
		result = service.insertEmployeeData(employeeBean);
		modelAndViewRef.setViewName("Home");
		modelAndViewRef.addObject("insertResponseValue", result);
		return modelAndViewRef;
	}

}









