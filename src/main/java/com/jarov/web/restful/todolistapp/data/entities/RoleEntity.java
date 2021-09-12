package com.jarov.web.restful.todolistapp.data.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
	name = "roles",
	uniqueConstraints = {
		@UniqueConstraint(columnNames = "name", name = "role_name_unique")
	}
)
public class RoleEntity {

	@Id
	@Column(nullable = false)
	private String name;
	
	@Builder.Default
	@ManyToMany(mappedBy = "roles")
	private Set<UserEntity> users = new HashSet<>();
}
