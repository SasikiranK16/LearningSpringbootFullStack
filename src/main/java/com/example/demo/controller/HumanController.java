package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.HumanDto;
import com.example.demo.entity.Human;
import com.example.demo.service.HumanService;

@RestController
public class HumanController {
	@Autowired
	public HumanService humanService;
	@PostMapping("/human/create")
	public HumanDto createHuman(@RequestBody Human human) {
	
		return humanService.createHuman(human);
	}
}
