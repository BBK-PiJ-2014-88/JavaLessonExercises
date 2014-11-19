import java.io.*;

public class Cat{
	public static void main(String[] args){
		Cat tester = new Cat();
		tester.launch();
	}

	public void launch(){
		System.out.println("Please enter a filename to open: ");
		String filename = System.console().readLine();
		File file = new File(filename);
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while((line = in.readLine()) != null){
				System.out.println(line);
			}
			in.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("File " + file + " does not exist.");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}