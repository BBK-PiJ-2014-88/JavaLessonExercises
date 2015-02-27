import java.rmi.*;
import java.rmi.registry.*;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Client{
	public static void main(String[] args)
	{
		Client c = new Client();
		c.ServerLink();
	}

	public void ServerLink(){
		try{
			/*Remote service = Naming.lookup("localhost:1099");
			EchoService echoService = (EchoService) service;//*/

			Registry reg = LocateRegistry.getRegistry("localhost", 1099);
			EchoService echoService = (EchoService) reg.lookup("echo");

			String receivedEcho = echoService.echo("Hello!");
			System.out.println(receivedEcho);

		} catch(RemoteException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}