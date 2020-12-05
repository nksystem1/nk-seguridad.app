package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log", schema = "public")
public class Log implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8130862063403711882L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date date;
	private String username;
	private String details;
	private String url;
	
	
	public Log() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Log(Date date, String username, String details, String url) {
		
		this.date = date;
		this.username = username;
		this.details = details;
		this.url = url;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Log [id=" + id + ", date=" + date + ", username=" + username + ", details=" + details + ", url=" + url
				+ "]";
	}
	

}
