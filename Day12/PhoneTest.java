import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest{
	@Test
	public void TestsGetBrand(){
	OldPhone nokia = new OldPhone("Nokia");
	String output = nokia.getBrand();
	String expected = "Nokia";
	assertEquals(output,expected);
	}


}