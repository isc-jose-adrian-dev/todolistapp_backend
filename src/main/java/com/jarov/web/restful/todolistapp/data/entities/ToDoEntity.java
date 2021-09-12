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
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoEntity {

	@Id
	@Column(unique = true)
	@SequenceGenerator(
			name = "todos_sequence",
			sequenceName = "todos_sequence",
			initialValue = 1,
			allocationSize = 1
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todos_sequence")
	private Long id;
	
	@Column(nullable = false)
	private String descrip;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@Transient
	//@Column(nullable = false)
	private DayOfWeekEntity dayOfWeek;
	
	@Column(nullable = false)
	private Integer noOrder;
	
	@Transient
	//@Column(nullable = false)
	private ImportanceEntity importance;
	
	@Column(columnDefinition = "boolean NOT NULL DEFAULT TRUE")
	private boolean active;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(table = "users", referencedColumnName = "id")
	@Column(nullable = false)
	private UserEntity user;
	
	@Column(columnDefinition = "boolean NOT NULL DEFAULT FALSE")
	private boolean alarmActive;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date alarmDate;
	
}
