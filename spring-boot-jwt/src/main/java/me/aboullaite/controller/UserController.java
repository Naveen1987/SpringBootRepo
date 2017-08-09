package me.aboullaite.controller;

import java.util.Date;

import javax.servlet.ServletException;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
public class UserController {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String email) throws ServletException {
		String jwtToken = "";
		jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();

		return jwtToken;
	}
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String data(){
		return "Welcome Here";
	}
}
