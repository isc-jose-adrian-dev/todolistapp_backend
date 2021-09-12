package com.jarov.web.restful.todolistapp.services;

import java.util.List;
import com.jarov.web.restful.todolistapp.data.models.response.DayOfWeekModel;

public interface DaysOfWeekService {
	
	public List<DayOfWeekModel> getAll();
}
