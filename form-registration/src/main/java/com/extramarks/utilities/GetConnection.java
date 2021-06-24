package com.extramarks.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetConnection {

	public static Connection getMySQL() {
//		String driver ="com.mysql.cj.jdbc.Driver"; 
//		String url ="jdbc:mysql://localhost/pjpb2"; 
//		String name ="root"; 
//		String password ="kanchan@1";

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("src/main/resources/db.properties"));
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String name = prop.getProperty("name");
			String password = prop.getProperty("password");

			Class.forName(driver);
			return DriverManager.getConnection(url, name, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println(getMySQL());
	}
}
