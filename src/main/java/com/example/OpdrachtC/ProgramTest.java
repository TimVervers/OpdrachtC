package com.example.OpdrachtC;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void PrintLineTest() {
		Program p = new Program();
		String lol = p.PrintLine("Lol");
		
		assertEquals(lol , "Lol grapje");
	}
	
	@Test
	public void calculate() {
		Program p = new Program();
		int i = p.calculate(45);
		
		assertNotNull(i);
	}
}