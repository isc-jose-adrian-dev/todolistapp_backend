package com.jarov.web.restful.todolistapp.data.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jarov.web.restful.todolistapp.data.entities.DayEntity;
import com.jarov.web.restful.todolistapp.data.models.response.DayModel;

@Mapper(componentModel = "day_mapper")
public interface DayMapper {
	@Mapping(target = "name", source = "name")
    DayEntity toEntity(DayModel dayModel);
	
	@Mapping(target = "name", source = "name")
    DayModel toModel(DayEntity dayModel);
}