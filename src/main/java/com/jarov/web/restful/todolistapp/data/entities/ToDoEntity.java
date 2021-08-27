package com.jarov.web.restful.todolistapp.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoEntity {

	@Id
	@Column(unique = true)
	@SequenceGenerator(
			name = "todos_sequence",
			sequenceName = "todos_sequence",
			initialValue = 1
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todos_sequence")
	private Long id;
	
	@Column(nullable = false)
	private String descrip;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
//	@Column(nullable = false)
//	private DayEntity dayOfWeek;
	
	@Column(nullable = false)
	private Integer noOrder;
	
//	@Column(nullable = false)
//	private ImportanceEntity importance;
	
	@Column(columnDefinition = "bit NOT NULL DEFAULT 1")
	private boolean active;
	
//	@Column(nullable = false)
//	private UserEntity user;
	
	@Column(columnDefinition = "bit NOT NULL DEFAULT 0")
	private boolean alarmActive;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date alarmDate;
	
}
