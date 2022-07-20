import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testGetArea() {
		Rectangle r1 = Rectangle(6,5);
		assertEquals(30,r1.getArea());
	}

}
