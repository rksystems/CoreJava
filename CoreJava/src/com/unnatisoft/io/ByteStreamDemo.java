package com.unnatisoft.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("C:/Users/Raghu Kishore/git/branches/CoreJava/bin/com/unnatisoft/oops/Constructor.class");
			outputStream = new FileWriter("TELUGUoutput.java");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

}
