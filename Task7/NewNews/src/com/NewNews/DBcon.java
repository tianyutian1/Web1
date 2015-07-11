package com.NewNews;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {

	Connection con = null;

	public DBcon() {
	}

	public Connection getCon() {

		 String driverName = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		 String dbURL = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=blogonline";
//		String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
//		String dbURL = "jdbc:odbc:test";
		String userName = "sa";
		String userPwd = "";
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL, userName, userPwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		DBcon db = new DBcon();
		System.out.println(db.getCon());

	}

}
