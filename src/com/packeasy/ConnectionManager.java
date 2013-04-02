package com.packeasy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	static Connection conn;

	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "packeasy"; // the name of Database.
			String uname = "packeasy_user";
			String pwd = "4Tc#uKa30nPQ";

			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(url + dbName, uname, pwd);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return conn;
	}

}