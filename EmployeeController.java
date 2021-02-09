package com.example.demo;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/yadav")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping
	public ResponseEntity<EmployeeEntity> yadav(EmployeeEntity e) throws Exception{
		EmployeeEntity jadhav =  es.yadav(e);
		return new ResponseEntity<EmployeeEntity>(jadhav,new HttpHeaders(),HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<EmployeeEntity>> jadhav(){
		       List<EmployeeEntity> meghu =  es.jadhav();
		       return new ResponseEntity<List<EmployeeEntity>>(meghu,new HttpHeaders(),HttpStatus.OK);
	
	}

}
