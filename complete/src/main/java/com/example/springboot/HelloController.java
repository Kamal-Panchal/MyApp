package com.example.springboot;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.POST,value = "/dialplan")
	@ResponseBody
	public String dialplan(/* @RequestBody Dialplan dialplan */ @RequestParam Map<String, String> body) {	
		System.out.println(body);
		body.get("section");
		
		return "Greetings from Spring Boot!";
	}

}
