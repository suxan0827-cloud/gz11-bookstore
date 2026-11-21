package com.ua.bookstore.web.dto;

import java.math.BigDecimal;

public record BookRequest(
        String title,
        String author,
        BigDecimal price,
        Integer year,
        String genre,
        String coverUrl,
        String description
) {}