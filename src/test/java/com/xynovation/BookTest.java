package com.xynovation;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class BookTest {
    @BeforeAll
    public static void setup() {
    }

    @Test
    public void shouldReturnMinimallyPopulatedBookObject() {
        Book book = new Book.BookBuilder("12345", "The Title").withDescription("Description").build();

        assertAll(
                () -> assertThat(book.getIsbn()).isEqualTo("12345"),
                () -> assertThat(book.getTitle()).isEqualTo("The Title"),
                () -> assertThat(book.getDescription()).isEqualTo("Description"));
    }

    @Test
    public void hello() {
        var message = """
            hello, java 16
                """;
        System.out.println(message);
    }
}
