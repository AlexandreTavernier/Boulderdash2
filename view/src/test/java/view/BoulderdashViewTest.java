package view;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

<<<<<<< HEAD
=======

>>>>>>> ec4b9e37cadd28bbf0f52cf042e38cce166c9503


public class BoulderdashViewTest {

	//test of every methods of BoulderDashView
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
<<<<<<< HEAD
	public void testDisplayMessage() {
		fail("Not yet implemented");
	}

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testShow() {
		fail("Not yet implemented");
	}

	@Test
=======
>>>>>>> ec4b9e37cadd28bbf0f52cf042e38cce166c9503
	public void testKeyTyped() {
		boolean isKeyTyped = false;
		boolean keyTyped = BoulderdashView.isKeyTyped;
		assertEquals(isKeyTyped, keyTyped);
		}
	}

