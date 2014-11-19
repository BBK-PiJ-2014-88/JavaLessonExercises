import java.io.*;

public class test
{
	public static void main(String[] args)
	{
		File file = new File("file2.txt");
		PrintWriter out = null;
		try {
			out = new PrintWriter(file);
			out.write("hello there");
			//out.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("Cannot write to file " + file + ".");
		}
		//	catch (IOException ex) {
		//	ex.printStackTrace();
		//}
		finally {
			out.close();
		}
	}

}