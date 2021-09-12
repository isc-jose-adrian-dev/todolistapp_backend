package com.jarov.web.restful.todolistapp.data.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jarov.web.restful.todolistapp.data.entities.ImportanceEntity;
import com.jarov.web.restful.todolistapp.data.models.response.ImportanceModel;

@Mapper(componentModel = "importance_mapper")
public interface ImportanceMapper {

	@Mapping(target = "name", source = "name")
	@Mapping(target = "level", source = "level")
    ImportanceEntity toEntity(ImportanceModel model);
	
	@Mapping(target = "name", source = "name")
	@Mapping(target = "level", source = "level")
	ImportanceModel toModel(ImportanceEntity entity);
}
