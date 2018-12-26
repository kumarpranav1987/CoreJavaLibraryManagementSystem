package com.library.betterdesign;

public class BookStorageFactory {
	public IBookStorage getBookStorage(StorageType storageType) {
		IBookStorage bookStorage = null;
		switch (storageType) {
		case IN_MEMORY:
			bookStorage = InMemoryBookStorage.getInstance();
			break;
		default:
			break;
		}
		return bookStorage;
	}
}
