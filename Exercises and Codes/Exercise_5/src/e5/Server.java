package e5;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	private List<ServerThread> clients = null;
	
	public Server() {
		ServerSocket svrSocket = null;
		Socket socket = null;
		try {
			svrSocket = new ServerSocket(4320);
			clients = new ArrayList<ServerThread>();
			System.out.println("\nInitializint Port...");
			System.out.println("\nListen...");
			
			while (true) {
				socket = svrSocket.accept();
				ServerThread st = new ServerThread(socket);
				clients.add(st);
				new Thread(st).start();
			}
			
		}catch( UnknownHostException e) {
			System.out.println("Error : Cannot find server." + e);
		}catch( IOException e ) {
			System.out.println("Error : I/O Error." + e);
		}finally {
			try {
				if (socket != null) 
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private class ServerThread implements Runnable {
		private Socket socket = null;
		public InputStream inputStream = null;
		public OutputStream outputStream = null;
		public DataInputStream dataStream = null;
		public PrintWriter printWriter= null;
		public DataOutputStream dataoutputStream = null;
		public String message;
		public BufferedReader charStream = new BufferedReader(new InputStreamReader(System.in));
		
		
		public ServerThread(Socket socket) throws IOException{
			this.socket=socket;
			printWriter= new PrintWriter(socket.getOutputStream(), true);
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
			dataStream = new DataInputStream(inputStream);
			dataoutputStream = new DataOutputStream(outputStream);
			outputStream = socket.getOutputStream();
			message = dataStream.readUTF();
			System.out.println(message + "\n");
			message = charStream.readLine();
			message+="\n";
			dataoutputStream.writeUTF(message);
		}
		public void readSocket(){
			try {
				message = dataStream.readUTF();
				System.out.println(message + "\n");
				message = charStream.readLine();
				message+="\n";
				dataoutputStream.writeUTF(message);
				if(message.equals("Exit")){
					System.exit(0);
				}
			}catch( UnknownHostException e) {
				System.out.println("Error : Cannot find server." + e);
			}
			catch( IOException e ) {
				System.out.println("Error : I/O Error." + e);
			}
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub		
			while (true) {
				readSocket();
			}
		}
	}
	public static void main(String args[]) {
		Server svr = new Server();
	}
}
