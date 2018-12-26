package com.library.betterdesign;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.library.Book;

public class InMemoryBookStorage implements IBookStorage {

	private Map<String, List<Book>> library = new HashMap<>();
	private Map<String, String> idToTitle = new HashMap<>();
	private static InMemoryBookStorage storage = new InMemoryBookStorage();

	private InMemoryBookStorage() {

	}

	public static IBookStorage getInstance() {
		return storage;
	}

	@Override
	public Book addBook(Book book) {
		List<Book> bookList = library.get(book.getBookTitle());
		if (null == bookList) {
			List<Book> list = new LinkedList<>();
			list.add(book);
			library.put(book.getBookTitle(), list);
		} else {
			bookList.add(book);
		}
		idToTitle.put(book.getBookId(), book.getBookTitle());
		return book;
	}

	@Override
	public List<Book> searchByTitle(String title) {
		return null;
	}

	@Override
	public Book deleteByID(String id) {
		return null;
	}

}
