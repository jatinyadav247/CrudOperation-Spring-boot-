package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepo;
	public EmployeeEntity yadav(EmployeeEntity e) throws Exception{
		Optional<EmployeeEntity> neha = empRepo.findById(e.getId());
		if(neha.isPresent()) {
			EmployeeEntity jatin = neha.get();
			jatin.setFirstName(e.getEmail());
			jatin.setLastName(e.getLastName());
			jatin.setEmail(e.getEmail());
			return empRepo.save(jatin);
		}
		
			return  empRepo.save(e);
		
	}
	public List<EmployeeEntity> jadhav(){
		          List<EmployeeEntity> naga =   empRepo.findAll();
		          if(naga.size()>0) {
		        	  return naga;
		          }
		          return new ArrayList<EmployeeEntity>();
	}

}
