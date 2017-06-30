package com.unnatisoft.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetThread implements Runnable {

	ResultSet uprs = null;
	
	
	public ResultSetThread(ResultSet rs) {
		super();
		this.uprs = rs;
	}


	@Override
	public void run() {
		
		try {
			uprs.absolute(1);
			uprs.updateString("name", "Ravi");
			uprs.updateRow();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
