package com.stormnet.yandex.framework.utility.dataManager;

import com.stormnet.yandex.framework.utility.logerator.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesManager {
	private static final String PATH_TO_PROPERTIES_FILE = "src/main/resources/UserData.property.properties";
	private static final Properties props;

	static {
		props = new Properties();
		LoadProperties();
	}

	private static void LoadProperties() {
		try (InputStream in = new FileInputStream(PATH_TO_PROPERTIES_FILE)) {
			Logger.getLogger().debug("Loading property file {}", PATH_TO_PROPERTIES_FILE);
			props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		String property = System.getenv(key);
		if (property == null) {
			property = props.getProperty(key);
		}
		Logger.getLogger().debug("Return value {} for property key {}", property, key);
		return property;
	}


}
