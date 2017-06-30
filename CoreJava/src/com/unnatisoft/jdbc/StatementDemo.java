package com.unnatisoft.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatementDemo {

	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<>();
		Connection con = JDBCConnectionUtil.getConnection();
		ResultSet rs = null;
		try(Statement st = con.createStatement()) {
			
			rs = st.executeQuery("SELECT * FROM ITEM WHERE ITEMID=1");
			ResultSetMetaData meta = rs.getMetaData();
			Item item;
			while (rs.next()) {
				item = new Item();
				item.setItemId(rs.getInt(1));
				//System.out.print(rs.getString(2) + "     ");
				item.setItemName(rs.getString(3));
				//System.out.println(rs.getString(4));
				itemList.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
