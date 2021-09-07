package com.jarov.web.restful.todolistapp.data.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	@Id
	@Column(unique = true)
	@SequenceGenerator(
			name = "users_sequence",
			sequenceName = "users_sequence",
			initialValue = 1
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
	private Long id;
	
	@Column(nullable = false, length = 16)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createAt;
	
	@Column(columnDefinition = "bit DEFAULT 1")
	private boolean active;
	
	@OneToMany(mappedBy = "user")
	private List<ToDoEntity> todos;
}
