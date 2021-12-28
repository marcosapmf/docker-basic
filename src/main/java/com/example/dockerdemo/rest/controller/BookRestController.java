package com.example.dockerdemo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerdemo.entity.Book;
import com.example.dockerdemo.service.BookService;

@RestController
public class BookRestController {
	@RequestMapping("/list")
	public List<Book> home() {
		return _bookService.findAll();
	}
	
	@Autowired
	private BookService _bookService;
}
