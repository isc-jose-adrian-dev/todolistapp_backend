package com.jarov.web.restful.todolistapp.data.models;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	
	@NotNull
	private Integer noOrder;
	
	private boolean active;
	
	private boolean alarmActive;
	
	private Date alarmDate;
}
