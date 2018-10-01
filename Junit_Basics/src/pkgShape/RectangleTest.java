package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	public void TestPerimeter() {
		// Determine expected value
		int iExpectedPerimeter = 16;

		// Create instance to test
		Rectangle rec = new Rectangle(4, 4);

		// Compare expected value with actual value
		assertEquals(iExpectedPerimeter, rec.Perimeter(), 0.01);
	}

	@Test
	public void TestArea() {
		// Determine expected value
		int iExpectedArea = 25;

		// Create instance to test
		Rectangle rec = new Rectangle(5, 5);

		// Compare expected value with actual value
		assertEquals(iExpectedArea, rec.Area(), 0.01);
	}
}
