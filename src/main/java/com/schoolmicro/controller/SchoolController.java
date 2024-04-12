package com.schoolmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolmicro.model.SchoolModel;
import com.schoolmicro.service.SchoolServiceImpl;


@RestController
@RequestMapping("/school")
public class SchoolController {
	
	@Autowired
	private SchoolServiceImpl schoolServiceImpl;
	
	@GetMapping("/getBySchoolId/{schoolId}")
	public ResponseEntity<?>getBySchoolId(@PathVariable Long schoolId){
		SchoolModel school=schoolServiceImpl.getBySchoolId(schoolId);
		if(school!=null) {
			return ResponseEntity.ok(school);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("given studentId is not Found");
		}
	}
	
	
	
	@PostMapping("/post")
	public ResponseEntity<String>insert(@RequestBody SchoolModel schoolModel){
		SchoolModel school=schoolServiceImpl.insert(schoolModel);
		if(school!=null) {
			return ResponseEntity.ok("inserted");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found student based on given studentId");
		}
	}

}
