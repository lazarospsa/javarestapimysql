package com.restapi.usermanagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {
	@Id
	@Column(name = "userid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	
	@Column(name = "username")
	private String username;

	@Column(name = "userphone")
	private String userphone;

	@Column(name = "useremail")
	private String useremail;
	
	
	
	public Long getUserId() {
		return userid;
	}

	public void setUserId(Long userId) {
		this.userid = userId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getUserPhone() {
		return userphone;
	}

	public void setUserPhone(String userPhone) {
		this.userphone = userPhone;
	}

	public String getUserEmail() {
		return useremail;
	}

	public void setUserEmail(String userEmail) {
		this.useremail = userEmail;
	}
}
