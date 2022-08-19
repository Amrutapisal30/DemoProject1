import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JComboBoxe  extends JFrame
{
String name[] = {"Abhi","Adam","Alex","Ashkay"}; //list of name.
public JComboBoxe()
{
JComboBox jc = new JComboBox(name); //initialzing combo box with list of

add(jc); //adding JComboBox to frame.
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 400);
setVisible(true);
}
public static void main(String[] args)
{
new JComboBoxe();
} 

}
