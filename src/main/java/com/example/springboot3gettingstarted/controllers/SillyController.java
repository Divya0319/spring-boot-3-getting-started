package com.example.springboot3gettingstarted.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot3gettingstarted.models.Fortune;

@RestController
public class SillyController {
	
	@GetMapping("/")
	public Fortune getFortune() {
		
		return new Fortune("Lucky", "Today is your lucky day!");
	}

}
