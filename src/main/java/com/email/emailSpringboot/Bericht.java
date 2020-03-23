package com.email.emailSpringboot;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Bericht {
	@NotNull
	private String name;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	@Min(10)
	private String bericht;
}
