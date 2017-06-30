package com.unnatisoft.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypes2 {

	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet uprs = stmt.executeQuery("SELECT * FROM Student");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			uprs.absolute(3);
			uprs.refreshRow();
			System.out.print(uprs.getInt(1)+" ");
			System.out.print(uprs.getString(2)+" ");
			System.out.print(uprs.getString(3)+" ");
			System.out.println(uprs.getString(4));

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
