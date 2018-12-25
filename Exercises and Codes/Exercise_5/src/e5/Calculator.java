package e5;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame{
	private int add = 1, sub = 2,mul = 3, div = 4;
	private int op = 0;
	boolean ifOp;
	private String output="0";
	private Button[] jbu=new Button[]{new Button("7"),new Button("8"),new Button("9"),new Button("/"),
			new Button("4"),new Button("5"),new Button("6"),new Button("*"),
			new Button("1"),new Button("2"),new Button("3"),new Button("-"),
			new Button("0"),new Button("."),new Button("="),new Button("+")};
	private JPanel jpt=new JPanel();
	private JPanel jpb=new JPanel();
	private JTextField jtf=new JTextField(1);
	
	class SetOperate_Act implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==jbu[3]){
				jtf.setText(divide(jtf.getText()));
				ifOp=true;
			}
			else if(e.getSource()==jbu[7]){
				jtf.setText(multiply(jtf.getText()));
				ifOp=true;
			}
			else if(e.getSource()==jbu[11]){
				jtf.setText(subtract(jtf.getText()));
				ifOp=true;
			}
			else if(e.getSource()==jbu[15]){
				jtf.setText(add(jtf.getText()));
				ifOp=true;
			}
			else if(e.getSource()==jbu[14]){
				jtf.setText(equal(jtf.getText()));
				ifOp=true;
			}
		}
	}
	
	class SetLabel_Act implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(output=="���ܳ���0"){
				jtf.setText("");
				ifOp=true;
			}
			Button it=(Button)e.getSource();
			if(ifOp){
				jtf.setText(it.getLabel());
				//output=jtf.getText();
				ifOp=false;
			}
			else{
				jtf.setText(jtf.getText()+it.getLabel());
				//output=jtf.getText();
			}
		}
	}
	
	public Calculator(){
		jpt.setLayout(new BorderLayout());
		
		jpt.add(jtf);
		this.add(jpt,BorderLayout.NORTH);
		//jpb.setLayout(new GridLayout(4,4));
		jpb.setLayout(null);
		jpb.setBackground(Color.gray);
		for(int i=0; i<jbu.length;i++){
			//jpb.add(new JPanel());
			jpb.add(jbu[i]);
			jbu[i].setBounds(10+(i/4)*60, 20+(i%4)*40, 50, 30);
			
			if(i==3||i==7||i==11||i==14||i==15){
				jbu[i].addActionListener(new SetOperate_Act());
			}
			else{
				jbu[i].addActionListener(new SetLabel_Act());
			}
		}
		this.add(jpb,BorderLayout.CENTER);
		this.setSize(260, 250);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void operate(String x){
		double x_=Double.valueOf(x);
		double y=output=="���ܳ���0"?0:Double.valueOf(output);
		switch(op){
			case 0:
				output=x;
				break;
			case 1:
				output=String.valueOf(y+x_);
				break;
			case 2:
				output=String.valueOf(y-x_);
				break;
			case 3:
				output=String.valueOf(y*x_);
				break;
			case 4:
				if(x!="0")
					output=String.valueOf(y/x_);
				else
					output="���ܳ���0";
				break;
		}
	}
	public String add(String x){
		operate(x);
		op=add;
		return output;
	}
	public String subtract(String x){
		operate(x);
		op=sub;
		return output;
	}
	public String multiply(String x){
		operate(x);
		op=mul;
		return output;
	}
	public String divide(String x){
		operate(x);
		op=div;
		return output;
	}
	public String equal(String x){
		operate(x);
		op=0;
		return output;
	}
	public void cleanit(){
		op=0;
		output="0";
	}

}
