package com.ten.controllers;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.ten.models.Student;
import com.ten.services.StudentService;

@RestController
public class MyRestController {
//Check this from postman
//	@PostMapping(consumes = "application/json",value="/save")
//	public String postReq(@RequestBody Student s){
//		
//		System.out.println(s);
//		return "POST";
//	}
	//Now JsonObject
	@Autowired
	StudentService std;
	@PostMapping(consumes = "application/json",value="/save")
	public String postReq(@RequestBody Student s) throws JSONException{
		JSONObject obj=new JSONObject();
		if(std.save(s)){
			 obj.put("data", "Submitted");
		}else{
			 obj.put("data", "Not Submitted");
		}
	   return obj.toString();
	}
	@PostMapping(consumes = "application/json",value="/save/{id}")
	public String postPath(@PathVariable int id){
		System.out.println(id);
		return "POST+path";
	}
	@GetMapping("/save")
	public String getReq(@RequestParam("sname") String sn,@RequestParam String scourse,@RequestParam Double sfee){
		System.out.println(sn);
		System.out.println(scourse);
		System.out.println(sfee);
		return "GET";
	}
	@PutMapping("/edit")
	public String editStudent(@RequestBody  String sid){
		System.out.println("Edit Student");
		System.out.println("Data="+sid);
		return "Put";
	}

	@PostMapping(consumes = "application/json",value="/delete")
	public String deleteStudent(@RequestBody  String sid){
		System.out.println("Delete Student"+sid);
		return "Post="+sid;
	}
	/*@GetMapping("/get")
	public String getStudent(){
		System.out.println(std.getStudents());
		return "GET";
	}*/
	
}
