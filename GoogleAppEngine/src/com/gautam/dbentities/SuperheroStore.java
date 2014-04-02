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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.appengine.api.datastore.Key;
 
@Entity
public class SuperheroStore implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 224819984138049L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;
	
	private String username;
	private String createdBy;
	private Date createdDate;
 
	public SuperheroStore() {
	}
 
	public SuperheroStore(Key key, String username, String createdBy,
			Date createdDate) {
		this.key = key;
		this.username = username;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}
 

	public Key getKey() {
        return key;
    }
 
	@Column(nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	@Column(nullable = false, length = 20)
	public String getCreatedBy() {
		return this.createdBy;
	}
 
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
 
	@Temporal(TemporalType.DATE)
	@Column(nullable = false, length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}
 
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString()
	{
		return "ID:" + getKey() + " Hero name:" + username; //+ " Created by:" + createdBy + " on " + createdDate;
	}
}
