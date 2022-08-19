import javax.swing.*;
import java.awt.*;
public class First {
	JFrame jf;
	public First() {
	jf = new JFrame("MyWindow"); //Creating a JFrame with name MyWindow.
	JButton btn = new JButton("Submit"); //Creating a Button.
	jf.add(btn); //adding button to frame.
	jf.setLayout(new FlowLayout()); //setting layout using FlowLayout

jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close

	jf.setSize(400, 400); //setting size
	jf.setVisible(true); //setting frame visibilty
	}
	public static void main(String[] args)
	{
	First f1=new First();
	}
}
