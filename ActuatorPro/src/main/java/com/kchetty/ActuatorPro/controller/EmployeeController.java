package com.kchetty.ActuatorPro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kchetty.ActuatorPro.beans.EmployeeBean;
import com.kchetty.ActuatorPro.services.EmployeeService;

@RestController
@RequestMapping({ "/testActuator/employeeController" })
public class EmployeeController {

	@Autowired
	EmployeeService __employeeServ;

	@Autowired
	private Environment __env;

	@Value("${testVal}")
	private String __testVal;

	@RequestMapping(method = { RequestMethod.POST }, value = { "/saveEmployee" }, produces = { "application/json" })
	@ResponseBody
	public ResponseEntity<?> saveEmployee(@RequestBody EmployeeBean _employee) {
		try {
			return new ResponseEntity<Map<String, Object>>(__employeeServ.saveEmployee(_employee), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
	}

	@RequestMapping(method = { RequestMethod.GET }, value = { "/getEmployee" }, produces = { "application/json" })
	@ResponseBody
	public ResponseEntity<?> getEmployee() {
		try {
			return new ResponseEntity<Map<String, Object>>(__employeeServ.getEmployee(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
	}

	@RequestMapping(method = { RequestMethod.GET }, value = { "/envDetails" })
	@ResponseBody
	public String envDetails() {
		try {
			return __env.getProperty("testVal");
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
