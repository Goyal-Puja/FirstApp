package com.example.firstapp;
import java.lang.Exception;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.firstapp.entity.Library;
import com.example.firstapp.model.*;
import com.example.firstapp.serviceImpl.LibraryReadServiceImpl;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2

@SpringBootApplication
@Slf4j
public class FirstAppApplication implements CommandLineRunner {
	
	@Autowired
	LibraryReadServiceImpl libraryReadServiceImpl; 
	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		System.out.println("Hello to Spring Boot");
	}

	@Override
	public void run(String... args) throws Exception {

//		GreatLearning gl = new GreatLearning();
//		gl.setCourseName("Spring Boot");
//		gl.setCourseType("JAVA J2EE");
//		gl.setInstructorName("Puja Goyal");
//		System.out.println(gl.getCourseName());
//		System.out.println(gl.getCourseType());
//		System.out.println(gl.getInstructorName());
		log.info("Fetching all the Libraries -> {}", libraryReadServiceImpl.getAllLibrary());
		log.info("Fetching Libraries With No Books -> {}", libraryReadServiceImpl.getAlllibrariesWithNoBooks());;
		log.info("Fetching Libraries with page format -> {}", libraryReadServiceImpl.getLibrariesPaged());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
