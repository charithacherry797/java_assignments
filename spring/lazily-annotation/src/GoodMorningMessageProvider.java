package com.capgemini.spring.provider;
//import org.springframework.stereotype.*;
//import org.springframework.context.annotation.*;

//@Lazy
//@Component
class GoodMorningMessageProvider implements MessageProvider{

	@Override
	public String getMessage(){
		
		return "Good Morning..!!";
	}

}