import org.junit.*;
import static org.junit.Assert.*;

public class PrimeDivisorListTest{
	private PrimeDivisorListImpl primeDivisorTester;

	@Before
	public void buildUp(){
		primeDivisorTester = new PrimeDivisorListImpl();
	}

	@Test
	public void testCorrectAdd(){
		primeDivisorTester.add(3);
		primeDivisorTester.add(5);
		primeDivisorTester.add(7);
		Integer expected = 5;
		Integer output = primeDivisorTester.remove(1);
		assertEquals(output, expected);
	}

	@Test(expected = NullPointerException.class)
	public void testAddNull(){
		primeDivisorTester.add(3);
		primeDivisorTester.add(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNonPrime(){
		primeDivisorTester.add(3);
		primeDivisorTester.add(8);
	}
}