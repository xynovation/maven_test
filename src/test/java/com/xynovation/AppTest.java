package com.xynovation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

// Unit test
public class AppTest {
    @BeforeAll
    public static void setup() {
    }

    @Test
    public void valueWithinRangeShouldReturnTrue() {
        App app = new App("Hello World!");

        assertThat(app.getMessage()).isEqualTo("Hello World!");
    }

}
