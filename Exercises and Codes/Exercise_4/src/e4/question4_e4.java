package e4;

import e4.bankSystem;

public class question4_e4 
{
	public static void main(String[]args){
		account A=new account("A");
		account B=new account("B");
		account C=new account("C");
		bankSystem test1=new bankSystem(B,A);
		bankSystem test2=new bankSystem(C,A);
		Thread t1=new Thread(test1);
		Thread t2=new Thread(test2);
		t1.start();
		t2.start();
	}
}
