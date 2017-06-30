package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestRS {

	public static void main(String[] args) {

		Connection con = JDBCConnectionUtil.getConnection();
		Statement stmt = null;
		ResultSet uprs = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			uprs = stmt.executeQuery("SELECT * FROM Student");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Thread rst1 = new Thread(new ResultSetThread(uprs));
		// Thread rst2 = new Thread(new ResultSetThread(uprs));
		rst1.start();
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		// rst2.start();
		try {
			while (uprs.next()) {
				System.out.print(uprs.getInt(1) + " ");
				System.out.print(uprs.getString(2) + " ");
				System.out.print(uprs.getString(3) + " ");
				System.out.println(uprs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
