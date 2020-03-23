package com.email.emailSpringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Email {
	@Value("${smtp.mailtrap.io}")
	private String host;
	@Value("${2525}")
	private int port;
	@Value("${2a73584fd1a8a3}")
	private String username;
	@Value("${7bfe26529a77c5}")
	private String password;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
