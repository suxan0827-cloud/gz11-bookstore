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
                    "Технічна література"
            ));

            bookService.saveBook(new Book(
                    null,
                    "Effective Java",
                    "Joshua Bloch",
                    new BigDecimal("720.00"),
                    2018,
                    "https://example.com/covers/effective-java.jpg",
                    "Практичні рекомендації та найкращі практики роботи з мовою Java.",
                    "Технічна література"
            ));

            bookService.saveBook(new Book(
                    null,
                    "Кобзар",
                    "Тарас Шевченко",
                    new BigDecimal("420.00"),
                    2021,
                    "https://example.com/covers/kobzar.jpg",
                    "Збірка поезій, що стала основою сучасної української літератури.",
                    "Поезія"
            ));
        };
    }
}