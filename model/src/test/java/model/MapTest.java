package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	private Map Map;
	private String scene1;

	@Before
	public void setUp() throws Exception {
		
		this.Map = new Map(scene1);
	}

	
	@Test
	public void testGetWidth() {
		int ExpectedWidth = 20;
		assertEquals(ExpectedWidth, Map.getWidth());
	}

	@Test
	public void testGetHeight() {
		int ExpectedHeight = 20;
		assertEquals(ExpectedHeight, Map.getHeight());
	}

	
	@Test
	public void testSetMobileHasChanged() {
		
	}

	@Test
	public void testGetObservable() {
		
	}

}
