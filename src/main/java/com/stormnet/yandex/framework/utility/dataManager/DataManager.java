package com.stormnet.yandex.framework.utility.dataManager;

public class DataManager {

	public static User getUser(){
		User user;
		return user = new User(PropertiesManager.getProperty("login"),PropertiesManager.getProperty("password"));
	}
}
