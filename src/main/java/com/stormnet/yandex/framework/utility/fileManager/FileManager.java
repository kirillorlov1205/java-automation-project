package com.stormnet.yandex.framework.utility.fileManager;

import java.io.File;
import java.io.IOException;

import static java.util.UUID.randomUUID;

public class FileManager {

	public static File generateFile() {
		File file = new File(generateFileName());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

	public static String generateFileName() {
		return randomUUID().toString().replaceAll("-", "").substring(0, 5);
	}

}
