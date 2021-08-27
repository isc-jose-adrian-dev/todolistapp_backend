package com.jarov.web.restful.todolistapp.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "importances_of_todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImportanceEntity {
	
	@Id
	@Column(unique = true)
	private String name;
	
	private byte level;
}
