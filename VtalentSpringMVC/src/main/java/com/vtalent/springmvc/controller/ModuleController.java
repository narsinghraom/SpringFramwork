package com.vtalent.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleController {
	@RequestMapping(value = "openingAnEmployeeReg")
	public String openEmployeeRegistrationPage() {
		String viewPage = "EmployeeRegistration";
		return viewPage;
	}

}
