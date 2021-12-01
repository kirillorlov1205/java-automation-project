package com.stormnet.yandex.framework.utility.dataManager;

import java.util.ArrayList;

public class Root {

	private ArrayList<User> users;

	public Root(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
}
