import java.io.*;

public class CP{
	public static void main(String[] args){
		if (args.length != 2){
			System.out.println("You must enter only 2 filenames");
			return; //Or could use System.exit(0);
		}
		String filename1 = args[0];
		String filename2 = args[1];
		File file1 = new File(filename1);
		File file2 = new File(filename2);
		BufferedReader in = null;
		if (file1.exists() == false){
			System.out.println("File 1 does not exist");
			return;
		}
		else if (file2.exists() == false){
			try{
				file2.createNewFile();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
			finally{
				file2.close();
			}
			try{
				in = new BufferedReader(new FileReader(file1));
				String line;
				PrintWriter out = new PrintWriter(file2);
				while((line = in.readLine()) != null){
					for (int x = 0; x < line.length(); x++){
						out.append(line.charAt(x));
					}
				}
			}
			catch(FileNotFoundException ex){
				System.out.println("File " + file1 + " does not exist.");
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
			finally{
				closeReader(in);
			}
		}
		else{
			System.out.println("Would you like to over-write " + filename2);
		}
	}
	private static void closeReader(Reader reader){
		try{
			if (reader != null){
				reader.close();
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}