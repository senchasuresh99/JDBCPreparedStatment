package com.blog.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {
	private Long id;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty(message = "Email should not be empty or null")
	@Email
	private String email;

	@NotEmpty(message = "Password should not be empty")
	private String password;

	/*
	 * private String passwordConform;
	 * 
	 * @AssertTrue(message = "Passwords should match") private boolean
	 * passwordsEqual;
	 */
}
