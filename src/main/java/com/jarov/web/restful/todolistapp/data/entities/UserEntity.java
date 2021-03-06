package com.jarov.web.restful.todolistapp.data.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
	name = "users",
	uniqueConstraints = {
		@UniqueConstraint(columnNames = "email", name = "user_email_unique"),
		@UniqueConstraint(columnNames = "id", name = "user_id_unique")
	}
)
public class UserEntity {

	@Id
	@Column(nullable = false)
	@SequenceGenerator(
			name = "users_sequence",
			sequenceName = "users_sequence",
			initialValue = 1,
			allocationSize = 1
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
	
	@Column(columnDefinition = "boolean NOT NULL DEFAULT TRUE")
	private boolean active;
	
	@OneToMany(mappedBy = "user")
	private List<ToDoEntity> todos;

	@Builder.Default
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name = "roles_by_users",
		joinColumns = {
			@JoinColumn(name = "user_id")
		},
		inverseJoinColumns = {
			@JoinColumn(name = "role_id")
		}
	)
	private Set<RoleEntity> roles = new HashSet<>();
}
