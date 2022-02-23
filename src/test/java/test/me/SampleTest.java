package test.me;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {
	
	private Sample s;
	
	@BeforeEach
	public void intialize() {
		s=new Sample();
	}

	@Test
	void testAdd() {
		assertEquals(8, s.add(3, 5), "add method");
	}

}
