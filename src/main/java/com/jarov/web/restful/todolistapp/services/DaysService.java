package com.jarov.web.restful.todolistapp.services;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarov.web.restful.todolistapp.data.mappers.DayMapper;
import com.jarov.web.restful.todolistapp.data.models.response.DayModel;
import com.jarov.web.restful.todolistapp.data.repositories.DaysRepository;

@Service
public class DaysService {

	@Autowired
	private DaysRepository repository;
	
	public List<DayModel> getAll(){
//		DayM
//		return this.repository.findAll().stream().map(entity -> );
		return null;
	}
}
