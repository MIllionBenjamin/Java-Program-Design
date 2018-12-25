package e5;

import java.net.*;
import java.io.*;

public class Client {
	
	// Initialize the stream 
	private OutputStream outputStream = null;
	private DataOutputStream dataoutputStream = null;
	private InputStream inputStream = null;
	private DataInputStream dataStream = null;
	private BufferedReader charStream = null;
	// Initialize Socket
	private Socket socket = null;
	private String message;
	private boolean flag = true;
	public static void main(String[] args) {
		new Client().stratUp();
	}
	private class ClientThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					inputStream = socket.getInputStream();
					dataStream = new DataInputStream(inputStream);
					charStream = new BufferedReader(new 
							InputStreamReader(System.in));
					message = dataStream.readUTF();
					System.out.print(message);
					if(message.equals("Exit")){ System.exit(0); }
					message = charStream.readLine();
					message+="\n";
					dataoutputStream = new DataOutputStream(outputStream);
					dataoutputStream.writeUTF(message);
				} catch(UnknownHostException e) {
					System.out.println("Error : Cannot find server." + e);
				}catch(IOException e) {
					System.out.println("Error : I/O Error." + e);
				}
			}
		}
	}
	private void stratUp() {
		try {
			charStream = new BufferedReader(new 
					InputStreamReader(System.in));
			if(flag) {
				message="\nConnect to Client!\n";
				flag = false;
			}else {
				message = charStream.readLine();
				message+="\n";
			}
			socket = new Socket("localhost", 4320);
			outputStream = socket.getOutputStream();
			dataoutputStream = new DataOutputStream(outputStream);
			dataoutputStream.writeUTF(message);
			new Thread(new ClientThread()).start();
		} catch(UnknownHostException e) {
			System.out.println("Error : Cannot find server." + e);
		} catch(IOException e) {
			System.out.println("Error : I/O Error." + e);
		} 
	}
} // end of Client Constructor 

