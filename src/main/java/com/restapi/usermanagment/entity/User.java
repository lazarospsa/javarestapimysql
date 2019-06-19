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
	private Long userId;
	
	@Column(name = "username")
	private String userName;

	@Column(name = "userphone")
	private String userPhone;

	@Column(name = "useremail")
	private String userEmail;
}
