package com.jarov.web.restful.todolistapp.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blacks_jwt")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlackJWTEntity {

	@Id
	@NotNull
	@Column(unique = true)
	private String jwt;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
}
