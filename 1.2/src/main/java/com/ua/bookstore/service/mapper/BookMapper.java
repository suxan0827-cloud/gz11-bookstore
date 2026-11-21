package com.ua.bookstore.service.mapper;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;
import com.ua.bookstore.web.dto.BookRequest;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookCardDto toCard(Book book) {
        return new BookCardDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPrice(),
                book.getCoverUrl()
        );
    }

    public BookDetailDto toDetail(Book book) {
        return new BookDetailDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPrice(),
                book.getYear(),
                book.getCoverUrl(),
                book.getDescription(),
                book.getGenre()
        );
    }

    public Book toDomain(BookRequest r) {
        Book b = new Book();
        b.setTitle(r.title());
        b.setAuthor(r.author());
        b.setPrice(r.price());
        b.setYear(r.year());
        b.setGenre(r.genre());
        b.setCoverUrl(r.coverUrl());
        b.setDescription(r.description());
        return b;
    }
}