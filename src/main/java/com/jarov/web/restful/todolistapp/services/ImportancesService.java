package com.jarov.web.restful.todolistapp.services;

import java.util.List;

import com.jarov.web.restful.todolistapp.data.models.response.ImportanceModel;

public interface ImportancesService {

	List<ImportanceModel> getAll();
}
