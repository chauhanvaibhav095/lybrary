package com.example.lybrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lybrary.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
