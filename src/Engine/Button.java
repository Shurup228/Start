package Engine;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import Engine.*;

public class Button extends Coord{
	

	public static void CreateButton(int x, int y, int x1, int x2)
	{
    JButton button1 = new JButton("Start");
    JButton button2 = new JButton("quit");
    button1.getActionCommand();
    button2.getActionCommand();
    button1.setLocation(x, y);
	button1.setLayout(new BorderLayout());
	button2.setLayout(new BorderLayout());
    Gui_Factory.Kappa.add(button1, BorderLayout.NORTH);
    Gui_Factory.Kappa.add(button2, BorderLayout.SOUTH);
	
	ButtonGroup group = new ButtonGroup();
    group.add(button1);
    group.add(button2);
    
	button1.repaint();
	button2.repaint();
    
	}
    public void actionPerformed(ActionEvent e) {
  
    	

	}
	
}
