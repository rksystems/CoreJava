package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypes {

	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet uprs = stmt.executeQuery("SELECT * FROM Student");

			uprs.moveToInsertRow();
			uprs.updateString("name", "Rama");
			uprs.updateInt("id", 1);
			uprs.updateString("phno", "12345");
			uprs.updateString("gender", "m");

			uprs.insertRow();
			uprs.beforeFirst();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
