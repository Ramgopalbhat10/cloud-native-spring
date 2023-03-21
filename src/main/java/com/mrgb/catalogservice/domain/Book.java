package com.mrgb.catalogservice.domain;

public record Book(
    String isbn,
    String title,
    String author,
    String price) {
}
