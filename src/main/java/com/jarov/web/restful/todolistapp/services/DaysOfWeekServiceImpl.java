package com.jarov.web.restful.todolistapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarov.web.restful.todolistapp.data.mappers.DayOfWeekMapperImpl;
import com.jarov.web.restful.todolistapp.data.models.response.DayOfWeekModel;
import com.jarov.web.restful.todolistapp.data.repositories.DaysOfWeekRepository;

@Service
public class DaysOfWeekServiceImpl implements DaysOfWeekService{

	@Autowired
	private DaysOfWeekRepository repository;
	
	public List<DayOfWeekModel> getDaysOfWeek(){
		DayOfWeekMapperImpl mapper = new DayOfWeekMapperImpl(); 
		return this.repository.findAll().stream().map(entity -> mapper.toModel(entity)).collect(Collectors.toList());
	}
}
