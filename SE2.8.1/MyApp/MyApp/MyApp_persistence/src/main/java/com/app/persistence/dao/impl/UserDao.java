package com.app.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.connection.factory.DBConnectionFactory;
import com.app.persistence.models.Event;
import com.app.persistence.models.Register;
import com.app.persistence.models.User;

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
	
	public Boolean register(Register dto){
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
	
	public Boolean addEvent(Event event)
	{
		Boolean flag = false;
		Connection con = DBConnectionFactory.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into events(event_name, created_date, venue, event_organizer, "
					+ " event_number, cust_first_name, cust_last_name, contact_number, email, "
					+ " expected_guests, table_size, event_planner1, event_planner2)"
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, event.getEventName());
			ps.setTimestamp(2, event.getCreatedDate());
			ps.setString(3, event.getVenue());
			ps.setString(4, event.getEventOrganizer());
			ps.setString(5, event.getEventNumber());
			ps.setString(6, event.getCustFirstName());
			ps.setString(7, event.getCustLastName());
			ps.setString(8, event.getContactNumber());
			
			ps.setString(9, event.getEmail());
			ps.setInt(10, event.getExpectedGuests()==null?0:event.getExpectedGuests());
			ps.setInt(11, event.getTableSize()==null?0:event.getTableSize());
			ps.setString(12, event.getEventPlanner1());
			ps.setString(13, event.getEventPlanner2());
			
			
			int result = ps.executeUpdate();
			if(result>0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public Boolean addUser(User user){
		Boolean flag = false;
		Connection con = DBConnectionFactory.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into eagles_users(username, contact_number, email, role) "
					+ " values(?,?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getContactNumber());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getRole());
			
			int result = ps.executeUpdate();
			if(result>0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
