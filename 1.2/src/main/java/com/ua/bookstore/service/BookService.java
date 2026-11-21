package com.ua.bookstore.service;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;
import com.ua.bookstore.web.dto.BookRequest;

import java.util.List;

public interface BookService {
    List<BookCardDto> getAllBooks();
    List<BookCardDto> findAll(String genre);
    BookDetailDto getBookById(Long id);
    BookDetailDto create(BookRequest request);
    BookDetailDto update(Long id, BookRequest request);
    void delete(Long id);
    Book saveBook(Book book);
}