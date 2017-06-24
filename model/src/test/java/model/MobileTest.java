package model;

import static org.junit.Assert.*;

import java.awt.Point;

import javax.swing.text.Position;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Interface.Permeability;

public class MobileTest {
	Mobile mobile;
	Sprite sprite;
	Map map;
	Permeability permeability;
	Position position;
	Point point;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sprite = new Sprite('A', "dirt.jpg");
		mobile  = new Mobile(1, 2, sprite , map, Permeability.BLOCKING);
	}

	

	@Test
	public void testMoveUp() throws Exception {
		
	}

	@Test
	public void testMoveLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoNothing() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetX() throws Exception {
		int ExpectedX = 1;
		assertEquals(ExpectedX, mobile.getX());
	}

	@Test
	public void testSetX() throws Exception {
		int ExpectedX = 1;
		mobile.setX(1);
		int x = mobile.getX();
		assertEquals(ExpectedX, x);
	}

	@Test
	public void testGetY() throws Exception {
		int ExpectedY = 2;
		mobile.setY(2);
		int y = mobile.getY();
		assertEquals(ExpectedY, y);
	}

	@Test
	public void testSetY() throws Exception {
		int ExpectedY = 2;
		assertEquals(ExpectedY, mobile.getY());
	}

	@Test
	public void testGetMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsAlive() {
		fail("Not yet implemented");
	}

	@Test
	public void testDie() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsDead() {
		fail("Not yet implemented");
	}

	@Test
	public void testAsWon() {
		int ExpectedSCOREMAX = 3;
		assertEquals(ExpectedSCOREMAX, 3);
	}

	@Test
	public void testWin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosition() {
		String expected = "Point";
		assertEquals(expected, ((Mobile) this.position).getX());
	}

	@Test
	public void testSetPosition() {
		Point ExpectedPosition = point;
		mobile.setPosition(point);
		Point position = mobile.getPosition();
		assertEquals(ExpectedPosition, position);
	}

	@Test
	public void testGetBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIsDig() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIsDig() {
		fail("Not yet implemented");
	}

}
