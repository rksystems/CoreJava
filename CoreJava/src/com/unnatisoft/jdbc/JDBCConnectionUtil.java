package com.unnatisoft.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnectionUtil {
	private static Connection con;

	private static Properties prop = new Properties();
	private static FileInputStream dbDetailsFile = null;

	public static Connection getConnection() {
		try {
			dbDetailsFile = new FileInputStream("src/com/unnatisoft/jdbc/dbdetails.properties");
			prop.load(dbDetailsFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Class.forName(prop.getProperty("mysql_driverName"));
		try {
			con = DriverManager.getConnection(prop.getProperty("mysql_url")+"?autoReconnect=true&useSSL=false", prop.getProperty("mysql_username"),
					prop.getProperty("mysql_password"));
		} catch (SQLException ex) {
			System.out.println("Failed to create the database connection.");
		}
		return con;
	}
}
