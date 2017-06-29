package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		ResultSet rs = null;
		try(Statement st = con.createStatement()) {
			
			rs = st.executeQuery("SELECT * FROM ITEM");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "     ");
				System.out.print(rs.getString(2) + "     ");
				System.out.print(rs.getString(3) + "     ");
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
