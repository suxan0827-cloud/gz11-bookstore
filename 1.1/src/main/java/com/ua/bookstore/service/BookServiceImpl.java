package com.ua.bookstore.service;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.exception.BookNotFoundException;
import com.ua.bookstore.repository.BookRepository;
import com.ua.bookstore.service.mapper.BookMapper;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookCardDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toCardDto)
                .toList();
    }

    @Override
    public BookDetailDto getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        return bookMapper.toDetailDto(book);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}