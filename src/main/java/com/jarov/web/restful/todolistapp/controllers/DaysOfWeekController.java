package com.jarov.web.restful.todolistapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarov.web.restful.todolistapp.data.models.response.DayOfWeekModel;
import com.jarov.web.restful.todolistapp.services.DaysOfWeekService;

@RestController
@RequestMapping("/v1/days_of_week")
public class DaysOfWeekController {

	@Autowired
	private DaysOfWeekService service;
	
	@GetMapping
	public ResponseEntity<List<DayOfWeekModel>> getDays(){
		List<DayOfWeekModel> allElements = this.service.getAll();
		return new ResponseEntity<List<DayOfWeekModel>>(allElements, HttpStatus.OK);
	}
}
