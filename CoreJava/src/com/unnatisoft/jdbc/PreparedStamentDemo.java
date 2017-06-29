package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStamentDemo {

	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEM WHERE ITEMID<?");
			pstmt.setLong(1, 10);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
