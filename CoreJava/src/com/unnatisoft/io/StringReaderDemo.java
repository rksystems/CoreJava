package com.unnatisoft.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StringReaderDemo {
	private final static String FILENAME = "src/com/unnatisoft/gc/GCDemo.java";

	public static void main(String[] args) {
		BufferedReader rd = null;
		StringReader srd = null;

		try {
			rd = new BufferedReader(new FileReader(FILENAME));

			String inputLine = null;
			StringBuilder builder = new StringBuilder();

			// Store the contents of the file to the StringBuilder.
			while ((inputLine = rd.readLine()) != null)
				builder.append(inputLine);

			// Create a new tokenizer based on the StringReader class instance.
			srd = new StringReader(builder.toString());
			StreamTokenizer tokenizer = new StreamTokenizer(srd);

			// Count the number of words.
			int count = 0;
			while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
				if (tokenizer.ttype == StreamTokenizer.TT_WORD)
					++count;
			}

			System.out.println("The total number of words are: " + count);
		} catch (IOException ex) {
			System.err.println("An IOException was caught: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			// Close all resources.
			try {
				if (rd != null)
					rd.close();

				if (srd != null)
					srd.close();
			} catch (IOException ex) {
				System.err.println("An IOException was caught: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
}