package Engine;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;

import Engine.*;

public class Button extends Coord{
	
	

	public static void CreateButton(int x, int y)
	{
    JButton button1 = new JButton("Start");
    button1.getActionCommand();
    button1.setLocation(x, y);
    button1.setVisible(true);
    button1.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,25);
	button1.setLayout(new BorderLayout());
    Gui_Factory.Kappa.add(button1, BorderLayout.NORTH);
	button1.repaint();
	}
	
}
