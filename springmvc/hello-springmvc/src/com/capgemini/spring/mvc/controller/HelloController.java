package com.capgemini.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping("/")
      public String setInput() {
    	   return "input";
    	   }

    	   /*
	 * @RequestMapping("/hello/{name}") public String sayHello(String name,Model
	 * model) { model.addAttribute("message","Hellocherry!"); return "hello";
	 * 
	 * }
	 */
	@RequestMapping("/hello")
      public String sayHello() {
     // model.addAttribute("message","Hellocherry!");
      return "hello";
	}
}
