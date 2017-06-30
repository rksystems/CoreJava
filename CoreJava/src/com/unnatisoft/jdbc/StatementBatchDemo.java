package com.unnatisoft.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementBatchDemo {
	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		Statement stmt = null;
		try {
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch("delete from student");
			stmt.addBatch("INSERT INTO  student VALUES(1, 'Rama','123456','M')");
			stmt.addBatch("INSERT INTO  student VALUES(2, 'Sita','123456','F')");
			stmt.addBatch("INSERT INTO  student VALUES(3, 'Rahim','123456','M')");
			stmt.addBatch("INSERT INTO  student VALUES(4, 'Robert','123456','M')");

			int[] updateCounts = stmt.executeBatch();
			for(int i=0; i<updateCounts.length; i++)
			System.out.println(updateCounts[i]+" row(s) updated");
			con.commit();

		} catch (BatchUpdateException b) {
			try {
				con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			b.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				con.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
