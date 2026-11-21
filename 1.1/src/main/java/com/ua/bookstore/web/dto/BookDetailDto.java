package com.ua.bookstore.web.dto;

import java.math.BigDecimal;

public record BookDetailDto(
        Long id,
        String title,
        String author,
        BigDecimal price,
        Integer year,
        String coverUrl,
        String description,
        String genre
) {
}