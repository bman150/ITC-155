import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Writen by Alexander Baker on 4/20/2020
// This is a jUnit test case for Octagon class
// ITC-155 Assignment 0 Octagon

class octagonTestCase {
	Octagon o = new Octagon(8); //create new instance of Octagon

	// Test case for area and perimeter of Octagon
	@Test
	void test() {
		// test area
		assertEquals(309.01933598375615, o.getArea());
		
		// test perimeter
		assertEquals(64.0, o.getPerimeter());
	}

}
