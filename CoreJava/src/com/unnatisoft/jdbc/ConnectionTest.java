package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebuy", "root", "root");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM ITEM");
		while (rs.next()) {
			System.out.print(rs.getString(1)+"     ");
			System.out.print(rs.getString(2)+"     ");
			System.out.print(rs.getString(3)+"     ");
			System.out.println(rs.getString(4));
		}
	}

}
