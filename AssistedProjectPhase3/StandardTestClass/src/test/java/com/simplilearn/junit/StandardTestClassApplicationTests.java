package com.simplilearn.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("JUnit 5 Assertion Example")
class StandardTestClassApplicationTests {

	@Test
	@DisplayName("assert Examples")
	void assertTest() {
		String str = null;
		String str2 = "some value";

		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };

		assertTrue(4 > 0);
		assertFalse(5 < 1);
		assertNull(str);
		assertSame(str, str);
		assertNotSame(str, str2);

		assertEquals(5, 5);
		assertNotEquals(5, 6);

		assertArrayEquals(a1, a2);

		assertThrows(RuntimeException.class, () -> {
			throw new RuntimeException();
		});
	}
}
