package com.stormnet.yandex.framework.utility.dataManager;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class UserManager {

	public Root parse() {
		Gson gson = new Gson();
		try (FileReader reader = new FileReader("src/main/resources/users.json")) {
			return gson.fromJson(reader, Root.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static User getUserByIndex(int index) {
		UserManager parser = new UserManager();
		Root root = parser.parse();
		User user;
		return user = root.getUsers().get(index);
	}

}

