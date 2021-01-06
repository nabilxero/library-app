package com.springbootcache.libraryapplication.api;

import com.springbootcache.libraryapplication.dto.Book;

public interface BookService {

    Book addBook(Book book);
    Book updateBook (Book book);
    Book getBook(long id);
    String deleteBook(long id);
}
