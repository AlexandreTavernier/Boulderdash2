package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
		private int Height = 16;
		private int Width = 24;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWidth() {
		int ExpectedWidth = 24;
		assertEquals(ExpectedWidth, Width);
	}

	@Test
	public void testGetHeight() {
		int ExpectedHeight = 16;
		assertEquals(ExpectedHeight, Height);
	}

	@Test
	public void testGetOnTheMapXY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMobileHasChanged() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObservable() {
		fail("Not yet implemented");
	}

}
