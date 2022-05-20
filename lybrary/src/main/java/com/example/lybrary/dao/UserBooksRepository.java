package com.example.lybrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lybrary.models.UserBooks;

public interface UserBooksRepository extends JpaRepository<UserBooks, Integer>{

}
