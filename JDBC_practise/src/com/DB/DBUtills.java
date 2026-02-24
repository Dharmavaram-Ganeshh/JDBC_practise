package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

import InstaHomePage.SingUpData;

public class DBUtills {
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/instaclone";
	public static final String USER="root";
	public static final String PASSWORD="gana@1291";
	
	public static String instaSingUpData(SingUpData userdata) throws SQLException {
		Connection connection=DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
		PreparedStatement pst=connection.prepareStatement("insert into user values(?,?,?,?,?);");
		pst.setString(1, userdata.getFirstName());
		pst.setString(2, userdata.getLastName());
		pst.setString(3, userdata.getEmailId());
		pst.setString(4, userdata.getUserName());
		pst.setString(5, userdata.getPassword());
		int insertRows=pst.executeUpdate();
		return "singUp successfull";
	}
	
	
	public static boolean isUserValidLogin(String userName,String password) throws SQLException {
		Connection connection=DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
		PreparedStatement pst=connection.prepareStatement("select count(*) from user where user_id=? and password=?");
		
		pst.setString(1,userName);
		pst.setString(2,password);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			int response=rs.getInt(1);
			if(response>0) {
				System.out.println("Authentic User!!");
				return true;
			}
		}
		return false;
	}
}
