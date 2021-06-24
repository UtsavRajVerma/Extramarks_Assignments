package com.extramarks.dao;

import java.sql.*;

public class demoDao {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Form", "root", "root");
			//here Form is database name, root is username and password  
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
//		        try {
//		            Class.forName("com.mysql.cj.jdbc.Driver");
//		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/JavaCRUD","root","");
//		        }catch(ClassNotFoundException ex) {
//		            
//		        } catch (SQLException ex) {
//		            // TODO Auto-generated catch block
//		            ex.printStackTrace();
//		        }	    
	}
}

