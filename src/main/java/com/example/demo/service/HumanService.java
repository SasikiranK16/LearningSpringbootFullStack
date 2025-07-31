package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.HumanDto;
import com.example.demo.entity.Human;
import com.example.demo.repo.HumanRepo;
import com.example.demo.service.impl.HumanServiceImpl;
@Service
public class HumanService implements HumanServiceImpl {

	@Autowired
	public HumanRepo humanRepo;
	@Override
	public HumanDto createHuman(Human human) {
		// TODO Auto-generated method stub
		Human h = new Human();
		h.setFname(human.getFname());
		h.setId(human.getId());
		h.setLname(human.getLname());
		Human humans = humanRepo.save(h);
		HumanDto humanDto = new HumanDto();
		humanDto.setFname(humans.getFname());
		humanDto.setId(humans.getId());
		humanDto.setLname(humans.getLname());
		return humanDto;
	}
	@Override
	public List<Human> getAllHumans() {
		// TODO Auto-generated method stub
		return humanRepo.findAll().stream().toList();
	}

}
