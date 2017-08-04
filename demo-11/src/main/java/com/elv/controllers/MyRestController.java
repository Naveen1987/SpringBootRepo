package com.elv.controllers;

import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;
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

import com.elv.models.Student;
import com.elv.services.StudentService;

@RestController
public class MyRestController {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
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
	public String editStudent(@RequestParam  String sid){
		System.out.println("Edit Student");
		System.out.println("Edit->"+sid);
		return "Put";
	}
	
	@PostMapping(value="/delete")
	public String deleteStudent(@RequestParam String sid){
		logger.info("Delete Student="+sid);
		std.delete(sid);
		return "Post";
	}
//	@PostMapping(value="/delete")
//	public String deleteStudent(@RequestParam (value="sid", required=false) String sid){
//		System.out.println("Delete  Student"+sid);
//		return "Post="+sid;
//	}
//	@PostMapping(value="/delete")
//	public String deleteStudent(WebRequest request){
//		System.out.println("Delete  Student"+request.getParameter("sid"));
//		return "Post=";
//	}
//	@PostMapping(value="/delete")
//	public String deleteStudent(HttpServletRequest request){
//		System.out.println("Delete  Student"+request.getParameter("sid"));
//		return "Post=";
//	}

	
// when Conten Type Application/Json	
//	@PostMapping(consumes = {"application/json"},value="/delete")
//	public String deleteStudent(@RequestBody  String sid){
//		System.out.println("Delete  RequestBody Student"+sid);
//		return "Post="+sid;
//	}
	

	
	
	/*@GetMapping("/get")
	public String getStudent(){
		System.out.println(std.getStudents());
		return "GET";
	}*/
	
}
