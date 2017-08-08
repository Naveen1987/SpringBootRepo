package com.elv.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfigurationClass extends WebSecurityConfigurerAdapter {

//	The name of method of any Name No any issue so don't confuse
	
//	@Autowired
//	public void abc(AuthenticationManagerBuilder auth)throws Exception{
//		auth.inMemoryAuthentication().withUser("neeraj").password("123").roles("USER");
//	}
	//But for readability take meaning full name like
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("neeraj").password("123").roles("USER");
	}
	
	@Autowired
	AuthenticationEntryPoint atn;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic()
		.authenticationEntryPoint(atn);
	}

}
