package com.unnatisoft.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyBoard {

	public static void main(String[] args) {
		// System.in standard input device i.e. keyboard
		// System.out standard output device
		// System.err The "standard" error output stream
		/*try {
			System.out.println((char)System.in.read());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println((char)br.read());//Reads a single character.
			System.out.println(br.readLine()); //Reads a line of text
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
