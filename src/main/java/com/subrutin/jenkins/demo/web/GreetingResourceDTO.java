package com.subrutin.jenkins.demo.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subrutin.jenkins.demo.dto.Message;

@RestController
public class GreetingResourceDTO {

	@GetMapping("/hello")
	public ResponseEntity<Message> sayGreetings(){
		return ResponseEntity.ok(new Message("Hello World"));
	}
}
