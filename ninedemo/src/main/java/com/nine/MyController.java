package com.nine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
    private Whether whether;
	@GetMapping("/")
	public String getIndex(){
		return whether.getWhether();
	}
}
