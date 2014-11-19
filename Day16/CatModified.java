import java.io.*;

public class CatModified{
	public static void main(String[] args){
		String filename = "";
		File file;
		for (int x = 0; x<args.length; x++){
			filename = args[x];
			file = new File(filename);
			BufferedReader in = null; //To be visible in all scopes
			try{
				in = new BufferedReader(new FileReader(file));
				String line;
				while((line = in.readLine()) != null){
					System.out.println(line);
				}
			}
			catch(FileNotFoundException ex){
				System.out.println("File " + file + " does not exist.");
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
			finally{
				System.out.println();
				try{
					if (in != null){
						in.close();
					}
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
	}
}