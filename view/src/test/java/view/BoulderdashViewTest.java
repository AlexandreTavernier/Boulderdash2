package view;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class BoulderdashViewTest {

	//test of every methods of BoulderDashView
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testKeyTyped() {
		boolean isKeyTyped = false;
		boolean keyTyped = BoulderdashView.isKeyTyped;
		assertEquals(isKeyTyped, keyTyped);
		}
	}

