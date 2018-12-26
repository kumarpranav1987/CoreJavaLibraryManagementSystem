package com.library;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LibraryMain {
	private static Map<String, List<Book>> library = new HashMap<>();
	private static Map<String, String> idToTitle = new HashMap<>();
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*************************************************************");
		System.out.println("         Welcome to Library Management System");
		System.out.println("*************************************************************");
		int option = 0;

		do {
			printUserOptions();
			option = s.nextInt();
			//clear buffer
			s.nextLine();
			switch (option) {
			case 1:
				addBook();
				break;
			case 2:
				System.out.println("Enter book title to be searched:");
				String title = s.nextLine();
				List<Book> bookList = searchByTitle(title);
				if (bookList != null && bookList.size() > 0) {
					System.out.println("Following Books found with book Title: " + title);
					for (Book book : bookList) {
						System.out.println(book);
					}
				} else {
					System.out.println("No Book found having Title: " + title);
				}

				break;
			case 3:
				System.out.println("Enter Book ID to be deleted");
				String id = s.nextLine();
				Book deletedBook = deleteBookById(id);
				if(deletedBook!=null) {
					System.out.println("Deleted Book=" + deletedBook);
				}
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Not a valid Option");
				break;
			}
		} while (option != 4);
		s.close();
	}

	private static Book deleteBookById(String id) {
		String title = idToTitle.get(id);
		Book bookToBeDeleted =null;
		if(title == null) {
			System.out.println("Book With ID="+id+" Not Found");
		}else {
			List<Book> bookList = library.get(title);
			Iterator<Book> itr = bookList.iterator();
			while(itr.hasNext()) {
				bookToBeDeleted= itr.next();
				if(bookToBeDeleted.getBookId().equals(id)) {
					itr.remove();					
					break;
				}
			}
			idToTitle.remove(id);
		}
		return bookToBeDeleted;
	}

	private static List<Book> searchByTitle(String title) {
		List<Book> bookList = library.get(title);
		if (bookList != null && bookList.size() > 0) {
			return bookList;
		}
		return null;
	}

	private static void addBook() {
		System.out.println("Enter Book ID , Title and Author\n");
		String  id = s.nextLine();
		String title = s.nextLine();
		String author = s.nextLine();
		Book newBook = new Book(id, title, author);
		List<Book> bookList = library.get(title);
		if (null == bookList) {
			List<Book> list = new LinkedList<>();
			list.add(newBook);
			library.put(title, list);
		} else {
			bookList.add(newBook);
		}
		idToTitle.put(id, title);
		System.out.println("New Book Added to library");
		System.out.println(newBook);
	}

	private static void printUserOptions() {
		System.out.println("Enter the option number");
		System.out.println("1)Add a Book");
		System.out.println("2)Search a Book by Title");
		System.out.println("3)Delete a Book by Book ID");
		System.out.println("4)Exit");
	}

}
