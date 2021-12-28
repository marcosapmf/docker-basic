package com.example.dockerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dockerdemo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
