package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class PlayerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		this.actual = new Sprite();
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		this.actual = new Sprite();
		}

	@Before
	public void setUp() throws Exception {
		this.actual = new Sprite();
		}

	@After
	public void tearDown() throws Exception {
		this.actual = new Sprite();
		}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
