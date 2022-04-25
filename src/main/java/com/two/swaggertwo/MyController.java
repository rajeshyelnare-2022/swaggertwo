package com.two.swaggertwo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/api")
public class MyController {
//	 @RequestMapping("/home")
	//    public String  home() {
	 //    return "XXX";   
	// }
	 ConcurrentMap<String,Student> students = new ConcurrentHashMap<>();
 
	 @GetMapping("/{id}")
	 @ApiOperation(value="Find Student by id",
	 notes=" Input an id for getting Student Information ",
	 response=Student.class)
	public Student getStudent(@PathVariable String id)
	 {
		 return students.get(id);
	 }
	 
	 @GetMapping("/")
	 @ApiOperation(value="Find All Students",
	 notes=" Get all the  Student Information without critera ",
	 response=List.class)
	 public List<Student> getAllStudents(){
		 return new ArrayList<Student>(students.values());
	 }
	 @PostMapping("/")
	 @ApiOperation(value="Add a Student in the application",
	 notes=" Add student by json post ",
	 response=Student.class)
	 public Student addStudent(@RequestBody Student student)
	 {
		 students.put(student.getId(), student);
		 return student;
		 
	 }
 
 
}
