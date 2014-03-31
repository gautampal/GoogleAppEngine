/**
 * 
 */
package com.gautam.dbentities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name = "DBUSER")

public class DBUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 224819984138049L;
	private long userId;
	private String username;
	private String createdBy;
	private Date createdDate;
 
	public DBUser() {
	}
 
	public DBUser(long userId, String username, String createdBy,
			Date createdDate) {
		this.userId = userId;
		this.username = username;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}
 
	@Id
	@Column(name = "USER_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getUserId() {
		return this.userId;
	}
 
	public void setUserId(long userId) {
		this.userId = userId;
	}
 
	@Column(name = "USERNAME", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	@Column(name = "CREATED_BY", nullable = false, length = 20)
	public String getCreatedBy() {
		return this.createdBy;
	}
 
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
 
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", nullable = false, length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}
 
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString()
	{
		return "USER_ID:" + userId + " Username:" + username + '\n';
	}
}
