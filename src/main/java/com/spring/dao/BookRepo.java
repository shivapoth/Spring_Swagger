package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
