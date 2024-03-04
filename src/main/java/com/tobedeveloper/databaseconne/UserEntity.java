package com.tobedeveloper.databaseconne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {

	@Id
	@Column(name="S.No")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
   @Column(name="username")
   private String username;
	@Column(name="Age")
	private String Ages;
	
public UserEntity() {
	
}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAges() {
		return Ages;
	}
	public void setAges(String ages) {
		Ages = ages;
	}

	
}





