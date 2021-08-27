package com.jarov.web.restful.todolistapp.data.models.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	@NotEmpty
	@Size(min = 8, max = 16)
	private String username;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	@Email
	private String email;

}
