package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dtos.HumanDto;
import com.example.demo.entity.Human;

public interface HumanServiceImpl {

	HumanDto createHuman(Human human);
	List<Human> getAllHumans();
}
