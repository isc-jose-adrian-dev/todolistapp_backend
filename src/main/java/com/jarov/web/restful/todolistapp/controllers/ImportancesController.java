package com.jarov.web.restful.todolistapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarov.web.restful.todolistapp.data.models.response.ImportanceModel;
import com.jarov.web.restful.todolistapp.services.ImportancesService;

@RestController
@RequestMapping("/v1/importances")
public class ImportancesController {

	@Autowired
	private ImportancesService service;
	
	@GetMapping
	public ResponseEntity<List<ImportanceModel>> getImportances(){
		List<ImportanceModel> allElements = this.service.getAll();
		return new ResponseEntity<List<ImportanceModel>>(allElements, HttpStatus.OK);
	}
}
