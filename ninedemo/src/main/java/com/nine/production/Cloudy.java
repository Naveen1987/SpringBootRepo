package com.nine.production;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nine.Whether;
@Service
@Profile({"production","default"})
public class Cloudy implements Whether {

	@Override
	public String getWhether() {
		// TODO Auto-generated method stub
		return"This is cloudy whether";
	}

}
