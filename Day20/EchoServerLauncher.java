import java.rmi.*;
import java.rmi.registry.*;
import java.net.MalformedURLException;

public class EchoServerLauncher{
	public static void main(String[] args){
		EchoServerLauncher tester = new EchoServerLauncher();
		tester.launch();
	}
	public void launch(){
			try {
			// 2. Create the registry if there is not one
			Registry reg = LocateRegistry.createRegistry(1099);
			// 3. Create the server object
			//EchoServer server = new EchoServer();
			// 4. Register (bind) the server object on the registy.
			// The registry may be on a different machine
			//String registryHost = "localhost";
			reg.rebind("echo", new EchoServer());
		} /*catch (MalformedURLException ex) {
			ex.printStackTrace();
		}//*/ catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}
