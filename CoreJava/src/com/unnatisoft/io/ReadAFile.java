package com.unnatisoft.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
		readFile("src/com/unnatisoft/gc/GCDemo.java");
	}

	public static void readFile(String filePath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(filePath);
			fos = new FileOutputStream("sdafsdafsad.txt");
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
