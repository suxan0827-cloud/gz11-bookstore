package com.ua.bookstore.service;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;

import java.util.List;

public interface BookService {
    List<BookCardDto> getAllBooks();
    BookDetailDto getBookById(Long id);
    Book saveBook(Book book);
}