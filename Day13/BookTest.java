import org.junit.*;
import static org.junit.Assert.*;
//Junit files are java classes, follow same rules

public class BookTest{
	private Books harryPotter;  //otherwise variable in buildup method will disapear,not be accessible by tests. Objects start with non capitals. use interface name

	@Before
	public void buildUp(){
		harryPotter = new BooksImpl("The Chamber of Secrets", "J.K. Rowling");
	}
	@Test
	public void testsgetAuthorNormal(){
		String expected = "J.K. Rowling";
		String output = harryPotter.getAuthor();
		assertEquals(output, expected);
	}
	@Test
	public void testsgetTitle(){
		String expected = "The Chamber of Secrets";
		String output = harryPotter.getTitle();
		assertEquals(output,expected);
	}
}