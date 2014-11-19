import java.io.*;

public class MakeDirectory{
	public static void main(String[] args){
		String directoryName = "";
		for (int x = 0; x < args.length; x++){
			directoryName = directoryName + " " + args[x];
		}
		String filename = directoryName;
		File file = new File(filename);
		file.mkdir();
	}
}