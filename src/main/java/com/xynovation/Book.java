package com.xynovation;

public class Book {
    private String isbn;
    private String title;
    private String description;

    private Book(BookBuilder builder) {
        isbn = builder.isbn;
        title = builder.title;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    // https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
    // https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
    public static class BookBuilder {
        private String isbn;
        private String title;
        private String description;

        public BookBuilder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public BookBuilder withDescription(String description) {
            if (description == null) {
                throw new IllegalArgumentException("Cannot be null.");
            }

            this.description = description;

            return this;
        }

        public Book build() {
            Book book = new Book(this);

            return book;
        }
    }
}
