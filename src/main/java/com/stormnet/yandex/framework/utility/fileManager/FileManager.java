package com.stormnet.yandex.framework.utility.fileManager;

import java.io.File;
import java.io.IOException;

import static java.util.UUID.randomUUID;

public class FileManager {

	private static final File file = new File(generateFile());

	public static String generateFile() {
		File file = new File(generateFileName().concat(".txt"));
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file.getPath();
	}

	public static String generateFileName() {
		return randomUUID().toString().replaceAll("-", "").substring(0, 5);
	}

	public static File getFile(){
		return file;
	}
}
