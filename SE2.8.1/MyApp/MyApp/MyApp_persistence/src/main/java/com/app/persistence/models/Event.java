package com.app.persistence.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event {
	
	@Id
	@GeneratedValue
	@Column(name="event_id")
	private Integer eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="created_date")
	private Timestamp createdDate;
	
	@Column(name="venue")
	private String venue;
	
	@Column(name="event_organizer")
	private String eventOrganizer;
	
	@Column(name="event_number")
	String eventNumber;
	
	//cust_first_name
	@Column(name="cust_first_name")
	String custFirstName;
	
	@Column(name="cust_last_name")
	String custLastName;
	
	@Column(name="contact_number")
	String contactNumber;
	
	@Column(name="email")
	String email;
	
	@Column(name="expected_guests")
	Integer expectedGuests;
	
	@Column(name="table_size")
	Integer tableSize;
	
	@Column(name="event_planner1")
	String eventPlanner1;
	
	@Column(name="event_planner2")
	String eventPlanner2;
	
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getEventOrganizer() {
		return eventOrganizer;
	}
	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}
	public String getEventNumber() {
		return eventNumber;
	}
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getExpectedGuests() {
		return expectedGuests;
	}
	public void setExpectedGuests(Integer expectedGuests) {
		this.expectedGuests = expectedGuests;
	}
	public Integer getTableSize() {
		return tableSize;
	}
	public void setTableSize(Integer tableSize) {
		this.tableSize = tableSize;
	}
	public String getEventPlanner1() {
		return eventPlanner1;
	}
	public void setEventPlanner1(String eventPlanner1) {
		this.eventPlanner1 = eventPlanner1;
	}
	public String getEventPlanner2() {
		return eventPlanner2;
	}
	public void setEventPlanner2(String eventPlanner2) {
		this.eventPlanner2 = eventPlanner2;
	}
}
