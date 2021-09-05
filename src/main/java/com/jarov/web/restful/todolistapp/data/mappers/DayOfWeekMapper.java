package com.jarov.web.restful.todolistapp.data.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jarov.web.restful.todolistapp.data.entities.DayOfWeekEntity;
import com.jarov.web.restful.todolistapp.data.models.response.DayOfWeekModel;

@Mapper(componentModel = "day_mapper")
public interface DayOfWeekMapper {
	@Mapping(target = "name", source = "name")
    DayOfWeekEntity toEntity(DayOfWeekModel dayModel);
	
	@Mapping(target = "name", source = "name")
    DayOfWeekModel toModel(DayOfWeekEntity dayModel);
}