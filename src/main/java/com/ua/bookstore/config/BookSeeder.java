package com.ua.bookstore.config;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class BookSeeder {

    @Bean
    public CommandLineRunner seedBooks(BookService bookService) {
        return args -> {
            if (!bookService.getAllBooks().isEmpty()) {
                return;
            }

            bookService.saveBook(new Book(
                    null,
                    "Clean Code",
                    "Robert C. Martin",
                    new BigDecimal("650.00"),
                    2008,
                    "https://example.com/covers/clean-code.jpg",
                    "Посібник із написання чистого, зрозумілого та підтримуваного коду.",
                    "Programming"
            ));

            bookService.saveBook(new Book(
                    null,
                    "Effective Java",
                    "Joshua Bloch",
                    new BigDecimal("720.00"),
                    2018,
                    "https://example.com/covers/effective-java.jpg",
                    "Практичні рекомендації та найкращі практики роботи з мовою Java.",
                    "Programming"
            ));

            bookService.saveBook(new Book(
                    null,
                    "Spring in Action",
                    "Craig Walls",
                    new BigDecimal("790.00"),
                    2022,
                    "https://example.com/covers/spring-in-action.jpg",
                    "Комплексне керівництво з розробки сучасних застосунків на Spring та Spring Boot.",
                    "Backend"
            ));
        };
    }
}