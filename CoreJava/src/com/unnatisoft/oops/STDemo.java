package com.unnatisoft.oops;

import java.util.StringTokenizer;

public class STDemo extends Object{

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(
				"Lorem Ipsum is simply dummy text of the "
				+ "printing:and:typesetting industry.", ",.");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
