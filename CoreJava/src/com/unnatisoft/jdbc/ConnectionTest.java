package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebuy", "root", "root");
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println(meta.getDatabaseProductName());
		System.out.println(meta.getDatabaseProductVersion());
		System.out.println(meta.getDatabaseMajorVersion());
		System.out.println(meta.getURL());
		System.out.println(meta.getUserName());
		System.out.println(meta.getDriverName());
		System.out.println(meta.getDriverVersion());
		System.out.println(meta.getDriverMajorVersion());
	}

}
