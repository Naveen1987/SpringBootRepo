package com.nine.devpro;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nine.Whether;

@Service
@Profile({"devpro"})//@Profile({"devpro","default"})
public class Sunny implements Whether {

	@Override
	public String getWhether() {
		// TODO Auto-generated method stub
		return "This is sunny whether";
	}

}
