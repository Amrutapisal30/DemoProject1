import javax.swing.*;
import java.awt.*;
public class Login {
	
	Login()
	{
		JFrame jf=new JFrame();
	  JLabel j1=new JLabel("Username");
	  j1.setBounds(20,20, 80,30);
	  jf.add(j1);
	  
	  JTextField t1=new JTextField(20);
	  t1.setBounds(100,20, 100,30);
	  jf.add(t1);
	  
	  JLabel j2=new JLabel("Password");
	    j2.setBounds(20,75, 80,30);
	  jf.add(j2);
	  
	  JTextField t2=new JTextField(20);
	   t2.setBounds(100,75,100,30);
	  jf.add(t2);
	  
	  JButton bt=new  JButton("Login");
	    bt.setBounds(100,120, 80,30); 
	  jf.add(bt);
	  
	  jf.setLayout(new FlowLayout()); //setting layout using FlowLayout
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close
      jf.setSize(400, 400); //setting size
	  jf.setVisible(true);
	  
	  
	  
	}
	public static void main(String[] args)
	{
		Login l1=new Login();
		
	}

}
