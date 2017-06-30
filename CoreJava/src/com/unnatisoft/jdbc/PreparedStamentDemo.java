package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStamentDemo {

	public static void main(String[] args) {
		Connection con = JDBCConnectionUtil.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO  student VALUES(?,?,?,?)");
			pstmt.setLong(1, 1);
			pstmt.setString(2, "Raju");
			pstmt.setString(3, "114425");
			pstmt.setString(4, "M");
			int row = pstmt.executeUpdate();
			System.out.println(row);
			
			pstmt.setLong(1, 2);
			pstmt.setString(2, "Ravi");
			pstmt.setString(3, "3213123");
			pstmt.setString(4, "M");
			row = pstmt.executeUpdate();
			System.out.println(row);
			
			pstmt.setLong(1, 3);
			pstmt.setString(2, "Kiran");
			pstmt.setString(3, "243432");
			pstmt.setString(4, "M");
			row = pstmt.executeUpdate();
			System.out.println(row);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
