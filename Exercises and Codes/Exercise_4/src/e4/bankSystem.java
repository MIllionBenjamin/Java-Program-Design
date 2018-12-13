package e4;

import e4.account;

public class bankSystem implements Runnable{
	account m;
	account n;
	bankSystem(account m_,account n_){
		m=m_;
		n=n_;
	}
	public void run() {
		while(n.balance<2100) {
			tansfer(m,n);
		}
	}
	//synchronized static void change(account a,int num) {
		//a.balance+=100;
	//}
	synchronized static void tansfer(account m,account n) {
		//while(n.balance<2100) {
		//synchronized(this) {
			n.balance+=100;
			System.out.println("account "+m.name+" transfer $100 to account "+n.name+", the balance of account "+n.name+": $"+n.balance);
		//}
		//}
	}

}