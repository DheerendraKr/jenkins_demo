package com.demo.jenkins.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class DemoController {
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, String>> welcome(){
		Map<String, String> response = new HashMap<>();
		response.put("message", "Welocome to the demo application.");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	

}
