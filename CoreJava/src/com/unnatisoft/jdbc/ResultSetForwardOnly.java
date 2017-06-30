package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetForwardOnly {

	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

			ResultSet upfrs = stmt.executeQuery("SELECT * FROM Student");
			upfrs.next();
			System.out.print(upfrs.getInt(1)+" ");
			System.out.print(upfrs.getString(2)+" ");
			System.out.print(upfrs.getString(3)+" ");
			System.out.println(upfrs.getString(4));
			upfrs.next();
			//upfrs.beforeFirst();
			//upfrs.afterLast();
			System.out.print(upfrs.getInt(1)+" ");
			System.out.print(upfrs.getString(2)+" ");
			System.out.print(upfrs.getString(3)+" ");
			System.out.println(upfrs.getString(4));
			

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
