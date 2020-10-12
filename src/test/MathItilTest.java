package test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MathUtil;
@DisplayName("Math Util")
class MathItilTest {
	MathUtil calc;
	//Set Up
	@BeforeEach
	void init() {
		//create instance of a class
		
		System.out.println("Starting to create object");
		 calc = new MathUtil();
		System.out.println("Created object");
	
	}
	//Annotation
	//identifies what methods are to be run as test.

	@Test
	void testAdd() {
	
				
		//expected
		int expected = 2;
		//Actual
		int actual = calc.add(1,1);
		//verify
		assertEquals(actual,expected);
		//assertEquals(calc.add(1, 1 ),2,
	}


	@Test
	void testSub() {
		
		int actual = calc.sub(1,1);
		
		assertEquals(actual,0);
		
	}
@Test
void testMultiplies() {
		
		int actual = calc.multiplies(1,1);
		
		assertEquals(actual,1);
		
	
}
@Test

void testdivides() {
	
	int actual = calc.multiplies(1,1);
	
	assertEquals(actual,1);
	

}

@Test

void testCircumference() {
	int radius = 10;
	double actual = calc.circumference(10);
	double expected = 2* radius * Math.PI;
	assertEquals(actual,expected);
	

}

}
	
		


