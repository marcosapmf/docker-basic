package com.example.dockerdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dockerdemo.entity.Book;
import com.example.dockerdemo.repository.BookRepository;

@Service
public class BookService {
	
	public List<Book> findAll() {
		return _bookRepository.findAll();
	}
	
	@Autowired
	private BookRepository _bookRepository;
}
