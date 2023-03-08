package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.patiententity;
import com.example.demo.repository.patientrepo;
@Service
public class patientservice {
	@Autowired //extends another class
	patientrepo stRepo; //reference variable
	
	public patiententity saveDetails(patiententity e) {
		return stRepo.save(e);
	}
	public List <patiententity>getDetails()

{
		return stRepo.findAll();
		
}
	public patiententity UpdateDetails(patiententity e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}



