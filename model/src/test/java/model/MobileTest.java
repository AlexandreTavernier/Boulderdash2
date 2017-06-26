package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Interface.IMap;
import Interface.IMobile;
import Interface.ISprite;
import Interface.Permeability;


public class MobileTest {
	IMobile Mobile;
	ISprite Sprite;
	IMap Map;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		this.Mobile = new Mobile(Sprite, Map, Permeability.BLOCKING, 0, 0);
	}

	

	@Test
	public void testGetX() {
		int ExpectedX = 0;
		assertEquals(ExpectedX, Mobile.getX());
	}

	
	@Test
	public void testSetX() {
		int ExpectedX = 0;
		Mobile.setX(0);
		int X = Mobile.getX();
		assertEquals(ExpectedX, X);
	}

	@Test
	public void testGetY() {
		int ExpectedY = 0;
		assertEquals(ExpectedY, Mobile.getY());
	}

	@Test
	public void testSetY() {
		int ExpectedY = 0;
		Mobile.setY(0);
		int Y = Mobile.getY();
		assertEquals(ExpectedY, Y);
	}

	@Test
	public void testGetMap() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testGetPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoard() {
		fail("Not yet implemented");
	}

}
