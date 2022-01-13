package com.xynovation;

import static org.junit.jupiter.api.Assertions.assertAll;

import com.xynovation.App;
import com.xynovation.Book;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

// Integration Test
public class AppIT {
    @Test
    public void appShouldReturnBook() {
        App app = new App("");
        Book book = app.getBook("Kevin's Awesome Guide to Software Development");

        assertThat(book.getTitle()).isEqualTo("Kevin's Awesome Guide to Software Development");
    }
}
