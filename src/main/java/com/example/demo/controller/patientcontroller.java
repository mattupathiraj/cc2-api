package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.patiententity;
import com.example.demo.service.patientservice;
@RestController
@CrossOrigin
public class patientcontroller {
	
	@Autowired //extends another class
	patientservice stuService;
	@PostMapping("/post")
	public patiententity addInfo(@RequestBody patiententity st)
	{
		return stuService.saveDetails(st);
		}@GetMapping("/get")
		public List<patiententity>fetchDetails(){
			return stuService.getDetails();
			}
		@PutMapping("/put")
		public patiententity UpdateInfo(@RequestBody patiententity st1){
			return stuService.UpdateDetails(st1);
			}
		
		@DeleteMapping("/Delete/{patientid}")
		public String deleteInfo (@PathVariable("patientid")int patientid) {
			stuService.deleteDetails(patientid);
			return "Deleted details";
			}
		}
