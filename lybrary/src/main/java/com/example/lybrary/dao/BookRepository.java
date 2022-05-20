package com.example.lybrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lybrary.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
