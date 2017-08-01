package com.ten.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ten.models.Student;

@RestController
public class MyRestController {

//	@PostMapping("/save")
//	public String postReq(@RequestParam("sname") String sn,@RequestParam String scourse,@RequestParam Double sfee){
//		System.out.println(sn);
//		System.out.println(scourse);
//		System.out.println(sfee);
//		return "Get";
//	}
	//Check this from postman
//	@PostMapping(consumes = "application/json",value="/save")
//	public String postReq(@RequestBody Student s){
//		
//		System.out.println(s);
//		return "POST";
//	}
	//Now JsonObject
	@PostMapping(consumes = "application/json",value="/save")
	public String postReq(@RequestBody Student s) throws JSONException{
		System.out.println(s);
	   JSONObject obj=new JSONObject();
	   obj.put("data", "Submitted");
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
	
}
