package com.jarov.web.restful.todolistapp.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "importances_of_todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImportanceEntity {
	
	@Id
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false, unique = true)
	private byte level;
}
