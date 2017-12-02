package com.springh4.repository;

import java.util.List;

import com.springh4.model.Book;
//It will get all from class that implement from it
public interface BookRepository {
	public List<Book> findAll();

	public Book findById(Integer id);

	public boolean save(Book book);

	public boolean remove(Integer id);

	public boolean update(Book book);

}
