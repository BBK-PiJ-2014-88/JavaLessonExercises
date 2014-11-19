import java.io.*;

public class FileTest{
	public static void main(String[] args){
		FileTest tester = new FileTest();
		tester.launch();
	}
	public void launch(){
		String filename = ".";
		File file = new File(filename);
		String[] fileList = file.list();
		for (int x = 0; x <fileList.length; x++){
			System.out.println(fileList[x]);
		}
	}

}