package com.example.firstapp.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.firstapp.model.GreatLearning;

@RestController
public class AppController {
	
//	@GetMapping("/info")
//
//	public GreatLearning get() {
//		
//		GreatLearning gl = new GreatLearning();
//		gl.setCourseName("Spring Boot");
//		gl.setCourseType("Java J2EE");
//		gl.setInstructorName("Puja Goyal");
//		return gl;
//	}
//	
//	@PostMapping("/custominfo")
//	
//	public GreatLearning customId(String courseName,String courseType,String instructorName) {
//		GreatLearning gl = new GreatLearning();
//		gl.setCourseName(courseName);
//		gl.setCourseType(courseType);
//		gl.setInstructorName(instructorName);
//		return gl;
//	}

}
