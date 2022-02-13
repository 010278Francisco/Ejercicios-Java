package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private final Calculator calculator = new Calculator();

	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5,3));
	}

	@Test
	void substraction() {
		assertEquals(5, calculator.subtractNumbers(8,3));
	}
	@Test
	void divide() {
		assertEquals(5, calculator.divideNumbers(8,3));
	}
}

