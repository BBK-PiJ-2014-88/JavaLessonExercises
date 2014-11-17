import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserTest{
	private LibraryUser user1;
	private LibraryUser user2;
	private LibraryUser user3;
	private LibraryUser user4;
	@Before
	public void buildup(){
		user1 = new LibraryUserImpl("Johnathan");
		user2 = new LibraryUserImpl("David");
		user3 = new LibraryUserImpl("Harold");
		user4 = new LibraryUserImpl("Johnathan");
	}
	@Test
	public void testsgetNameSimple(){
		String expected = "Johnathan";
		String output = user1.getName();
		assertEquals(output, expected);
	}
	@Test
	public void testsSameNameTwice(){
		String expected = "Johnathan2";
		String output = user4.getName();
		assertEquals(output, expected);
	}
	@Test
	public void checksIDSetter(){
		user1.setID();
		int expected = 0;
		int output = user1.getID();
		assertEquals(output, expected);
	}

}