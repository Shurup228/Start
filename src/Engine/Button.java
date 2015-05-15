package Engine;

import javax.swing.JButton;

public class Button extends Coord{

	public static void MainButtons()
	{
    JButton button1 = new JButton("Start");
    button1.getActionCommand();
    button1.setLocation(500, 500);
    button1.setVisible(true);
	}
	
}
