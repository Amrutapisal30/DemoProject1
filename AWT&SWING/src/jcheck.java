import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class jcheck extends JFrame{
	public  jcheck()
	{
	JCheckBox jcb = new JCheckBox("yes"); //creating JCheckBox.
	add(jcb); //adding JCheckBox to frame.
	jcb = new JCheckBox("no"); //creating JCheckBox.
	add(jcb); //adding JCheckBox to frame.
	jcb = new JCheckBox("maybe"); //creating JCheckBox.
	add(jcb); //adding JCheckBox to frame.
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(400, 400);
	setVisible(true);
	}
	public static void main(String args[])
	{
	new  jcheck();
	}

}
