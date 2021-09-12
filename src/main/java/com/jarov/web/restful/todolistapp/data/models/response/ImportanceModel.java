package com.jarov.web.restful.todolistapp.data.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImportanceModel {

	private String name;
	
	private byte level;
}
