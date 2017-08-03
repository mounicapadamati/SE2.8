package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dto.RegisterDto;
import com.app.factory.DBConnectionFactory;

public class UserDao {
	public Boolean login(String username, String pwd){
		Boolean flag = false;
		Connection con = DBConnectionFactory.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public Boolean register(RegisterDto dto){
		Boolean flag = false;
		Connection con = DBConnectionFactory.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?,?,?)");
			ps.setString(1, dto.getFirstName());
			ps.setString(2, dto.getPassword());
			ps.setString(3, dto.getUsername());
			ps.setString(4, dto.getLastName());
			ps.setString(5, dto.getPhneNumber());
			ps.setString(6, dto.getGender());
			int result = ps.executeUpdate();
			if(result>0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
