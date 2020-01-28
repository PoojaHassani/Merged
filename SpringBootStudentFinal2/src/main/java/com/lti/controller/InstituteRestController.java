package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Institute;
import com.lti.model.Scheme;
import com.lti.model.Student;
import com.lti.service.InstituteService;

@RestController
@RequestMapping(path ="/")
@CrossOrigin
public class InstituteRestController {
	@Autowired
	private InstituteService service;
	//localhost:9091/
	
	@RequestMapping(path="hello")
	public String HelloWorld(){
		return "Hello";
	}
	@RequestMapping(path="institute/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addInstitute(@RequestBody Institute institute) {
		ResponseEntity<String> response;
		boolean result=service.addInstitute(institute);
		if(result){
			response=new ResponseEntity<String>("Institute  is added",HttpStatus.CREATED);
		}else{
			response=new ResponseEntity<String>("Institute is not added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	//localhost:9091/
	@RequestMapping(path="cc/{instituteCode}/{setPassword}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> LoginInstitute(@PathVariable("instituteCode") int instituteCode,@PathVariable("setPassword") String setPassword) {
		ResponseEntity<String> response;
		
		boolean result =  service.loginInstitute(instituteCode, setPassword);
		System.out.println("Result " + result);
		if(result){
			response=new ResponseEntity<String>("Login successful",HttpStatus.CREATED);
		}else{
			response=new ResponseEntity<String>("Login failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@RequestMapping(path="student/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		ResponseEntity<String> response;
		boolean result=service.addStudent(student);
		if(result){
			response=new ResponseEntity<String>("Student  is added",HttpStatus.CREATED);
		}else{
			response=new ResponseEntity<String>("Student is not added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@RequestMapping(path="Scheme/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>adddStudentScheme(@RequestBody Scheme scheme) {
		ResponseEntity<String> response;
		boolean result=service.addStudentScheme(scheme);
		if(result){
			response=new ResponseEntity<String>("Scheme registered  is added",HttpStatus.CREATED);
		}else{
			response=new ResponseEntity<String>("Scheme is not added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
}
