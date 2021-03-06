package com.library.betterdesign;

import java.util.List;

import com.library.model.Book;

public interface IBookStorage {
	Book addBook(Book book);

	List<Book> searchByTitle(String title);

	Book deleteByID(String id);
}
