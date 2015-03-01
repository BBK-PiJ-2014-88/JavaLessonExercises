package networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class NetworkingPractice{
	public static void main(String[] args) throws UnknownHostException, IOException{
		NetworkingPractice launcher = new NetworkingPractice();
		launcher.launch();
	}
	public void launch() throws UnknownHostException, IOException{
		ServerSocket serverSocket = new ServerSocket(9000);
	}
}