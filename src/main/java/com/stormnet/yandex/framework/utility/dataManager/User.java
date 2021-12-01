package com.stormnet.yandex.framework.utility.dataManager;

public class User {

	private String login;
	private String password;

	public User(String userName, String password) {
		this.login = userName;
		this.password = password;
	}

	public User(User user) {
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}
}
