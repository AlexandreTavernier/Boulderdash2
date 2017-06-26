package Testmain.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.mainClass;

public class mainClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getPlayerY() {
		int ExpectedY = 0;
		int Y = mainClass.startY;
		assertEquals(ExpectedY, Y);
	}
	
	@Test
	public void getPlayerX() {
		int ExpectedX = 5;
		int X = mainClass.startX;
		assertEquals(ExpectedX, X);
	}

}
