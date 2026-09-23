package com.book.dao;

import java.util.List;

import com.book.pojo.book;


public interface bookDao {

	void addbook(book item);

	List<book> getAllBook();

	void updateBook(book item);

	void deleteBook(int id);

}
