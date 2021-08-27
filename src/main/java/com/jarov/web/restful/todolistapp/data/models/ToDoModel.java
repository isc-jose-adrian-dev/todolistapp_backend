package com.jarov.web.restful.todolistapp.data.models;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.jarov.web.restful.todolistapp.data.entities.DayEntity;
import com.jarov.web.restful.todolistapp.data.entities.ImportanceEntity;
import com.jarov.web.restful.todolistapp.data.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoModel {

	private Long id;

	@NotEmpty
	private String descrip;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
//	@NotNull
//	private DayEntity dayOfWeek;
	
	@NotNull
	private Integer noOrder;
	
//	@NotNull
//	private ImportanceEntity importance;
	
	private boolean active;
	
//	@NotNull
//	private UserEntity user;
	
	private boolean alarmActive;
	
	private Date alarmDate;
}
