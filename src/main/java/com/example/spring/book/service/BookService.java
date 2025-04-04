package com.example.spring.book.service;

import com.example.spring.book.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class BookService {
    static List<BookEntity> bookStorage = new ArrayList<>();

    public BookService() {
        fillStorage();
    }

    public void fillStorage() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            BookEntity book = new BookEntity();
            book.setId(i);
            book.setName("Book #" + + random.nextInt(100, 999));
            book.setDescription("lorem ipsum");
            bookStorage.add(book);
        }
    }

    public List<BookEntity> all() {
        return bookStorage;
    }

    public Optional<BookEntity> byId(Integer id) {
        return bookStorage.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public BookEntity create(String name, String description) {
        BookEntity book = new BookEntity();
        book.setId(bookStorage.size());
        book.setName(name);
        book.setDescription(description);
        bookStorage.add(book);
        return book;
    }
}
