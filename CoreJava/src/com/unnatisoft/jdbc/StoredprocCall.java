package com.unnatisoft.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StoredprocCall {

	public static void main(String[] args) {
		Connection conn = JDBCConnectionUtil.getConnection();
		try {
			CallableStatement callableStamt = conn.prepareCall("call my_proc_OUT(?)");
			callableStamt.registerOutParameter(1, Types.INTEGER);
			callableStamt.execute();
			System.out.println(callableStamt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
