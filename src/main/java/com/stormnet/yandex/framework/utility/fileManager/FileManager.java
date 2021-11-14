package com.stormnet.yandex.framework.utility.fileManager;

import java.io.File;
import java.util.Random;

public  class FileManager {

	public static File createFile() {
		Random random = null;
		String fileName = Double.toString(random.nextDouble()).substring(0, 5);
		return new File(fileName + ".txt");
	}

}
