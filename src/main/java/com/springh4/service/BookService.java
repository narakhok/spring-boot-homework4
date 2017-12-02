package com.springh4.service;

import java.util.List;

import com.springh4.model.Book;

public interface BookService {
	public List<Book> findAll();

	public Book findByID(Integer id);

	public void save(Book book);

	public void remove(Integer id);

	public void update(Book book);
}
