import java.awt.*;
public class ButtonExample extends Frame
{
	ButtonExample()
	{
		Button btn=new Button("Hello world");
		add(btn);
		setTitle("spark");
		
		setSize(400,500);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		ButtonExample L1=new ButtonExample();
		
	}
}
