package com.jarov.web.restful.todolistapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jarov.web.restful.todolistapp.data.mappers.ImportanceMapperImpl;
import com.jarov.web.restful.todolistapp.data.models.response.ImportanceModel;
import com.jarov.web.restful.todolistapp.data.repositories.ImportancesRepository;

@Service
public class ImportancesServiceImpl implements ImportancesService{

	@Autowired
	private ImportancesRepository repository;
	
	@Override
	public List<ImportanceModel> getAll() {
		ImportanceMapperImpl mapper = new ImportanceMapperImpl(); 
		return this.repository.findAll().stream().map(entity -> mapper.toModel(entity)).collect(Collectors.toList());
	}

}
