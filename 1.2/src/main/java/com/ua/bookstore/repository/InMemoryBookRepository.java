package com.ua.bookstore.repository;

import com.ua.bookstore.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryBookRepository implements BookRepository {

    private final Map<Long, Book> storage = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Book> findByGenre(String genre) {
        return storage.values().stream()
                .filter(b -> b.getGenre() != null && genre.equalsIgnoreCase(b.getGenre()))
                .toList();
    }

    @Override
    public Book save(Book book) {
        if (book.getId() == null) {
            book.setId(idGenerator.getAndIncrement());
        }
        storage.put(book.getId(), book);
        return book;
    }

    @Override
    public boolean deleteById(Long id) {
        return storage.remove(id) != null;
    }
}