package com.xynovation;

/**
 * Hello world!
 *
 */
public class App {
    private String message;

    public App(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Book getBook(String title) {
        Book book = new Book.BookBuilder("", title).build();

        return book;
    }
}
