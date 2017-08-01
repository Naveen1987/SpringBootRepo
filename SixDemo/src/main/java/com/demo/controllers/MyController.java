package com.demo.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.models.Student;
import com.demo.services.MyService;

@RestController
public class MyController {

	@Autowired 
	private MyService mys;
	
	@GetMapping("/")
	public String getHome(){
		return "Welcome On home page";
	}
	//@PostMapping(value="/save",consumes={"application/json"})
	//or
	@PostMapping(value="/save")
	public String save(@RequestBody Student s){
		if(s.getSid()!=0){
		s.setSid(0);
		}
		mys.save(s);
		return "Saved";
	}
	@PutMapping("/update")
	public String update(@RequestBody Student s){
		mys.update(s);
		return "Updated";
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id){
		mys.delete(id);
		return "Deleted";
	}
	@DeleteMapping("/deleteall")
	public String deleteAll(){
		mys.deleteAll();
		return "Delete All";
	}
	@GetMapping("/find/{id}")
	public Student getStudent(@PathVariable int id){
		return mys.findOne(id);
	}
	@GetMapping("/findall")
	public List<Student> getStudents(){
		ArrayList<Student> ap=new ArrayList<Student>();
		Iterator<Student> sp=mys.findAll().iterator();
		while(sp.hasNext()){
			ap.add(sp.next());
		}
		System.out.println(ap);
		return ap;
	}
}
