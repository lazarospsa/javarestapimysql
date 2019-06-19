package com.restapi.usermanagment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.usermanagment.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
