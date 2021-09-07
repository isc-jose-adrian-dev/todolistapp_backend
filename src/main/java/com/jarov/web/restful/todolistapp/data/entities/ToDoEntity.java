package com.jarov.web.restful.todolistapp.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "day_of_week_name", referencedColumnName = "name")
	private DayOfWeekEntity dayOfWeek;
	
	@Column(nullable = false)
	private Integer noOrder;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "importance_of_todo_name", referencedColumnName = "name")
	private ImportanceEntity importance;
	
	@Column(columnDefinition = "bit NOT NULL DEFAULT 1")
	private boolean active;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserEntity user;
	
	@Column(columnDefinition = "bit NOT NULL DEFAULT 0")
	private boolean alarmActive;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date alarmDate;
	
}
