import org.junit.*;
import static org.junit.Assert.*;

public class PeopleTest{
	@Test
	public void testsNormalName(){
		People p = new People();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output,expected);
		}
	@Test
	public void testsDoubleSpaceName(){
		People p = new People();
		String input = "John  Smith";
		String output = p.getInitials(input);
		String expected = "JS";
		assertEquals(output,expected);
		}
	@Test
	public void testsDoubleSpaceName2(){
		People q = new People();
		String input = "Prince Charles";
		String output = q.getInitials(input);
		String expected = "PC";
		assertEquals(output,expected);
		}
	@Test
	public void testsNormalName2(){
		People q = new People();
		String input = "Albert Einstein";
		String output = q.getInitials(input);
		String expected = "AB";
		assertEquals(output,expected);
		}
}