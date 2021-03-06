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
			uprs.absolute(3);
			System.out.print(uprs.getInt(1)+" ");
			System.out.print(uprs.getString(2)+" ");
			System.out.print(uprs.getString(3)+" ");
			System.out.println(uprs.getString(4));
			
			uprs.moveToInsertRow();
			uprs.updateInt(1, 4);
			uprs.updateString(2, "Naresh");
			uprs.updateString(3, "5689");
			uprs.updateString(4, "M");
			uprs.insertRow();
			
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
