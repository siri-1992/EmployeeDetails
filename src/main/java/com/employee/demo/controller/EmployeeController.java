package com.employee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.EmployeeEntity;
import com.employee.demo.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService bs;
@PostMapping (value = "addInfo")
public String addEmpInfo(@RequestBody EmployeeEntity bc) {
	return bs.addEmpInfo(bc);
}

}

