package com.library.betterdesign;

import com.library.Book;

public interface IBookStorage {
	Book addBook(Book book);

	void deleteBook(Book book);

	void searchByTitle(String title);

	void deleteByID(String id);
}
