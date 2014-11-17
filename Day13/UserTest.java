import org.junit.*;
import static org.junit.Assert.*;

public class UserTest{
	private UserImpl user1;
	private UserImpl user2;
	private UserImpl user3;
	private UserImpl user4;
	@Before
	public void buildup(){
		user1 = new UserImpl("Johnathan");
		user2 = new UserImpl("David");
		user3 = new UserImpl("Harold");
	}
	@Test
	public void testsgetNameSimple(){
		String expected = "Johnathan";
		String output = user1.getName();
		assertEquals(output, expected);
	}

	@Test
	public void checksIDSetter(){
		user2.setID(2);
		int expected = 2;
		int output = user2.getID();
		assertEquals(output, expected);
	}

}