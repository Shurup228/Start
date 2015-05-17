package Engine;

import Util.*;

import java.awt.*;

import javax.swing.*;

public class Button extends Coord{
	
	public static ButtonGroup Button_Group = new ButtonGroup();
	
	public static void CreateButton(int x, int y, int x1, int y1, String name) {
	
    JButton button = new JButton(name);
    button.setLocation(getCoordBig(x), getCoordBig(y));
    button.setSize(Coord.getSizeBig(x1), Coord.getSizeBig(y1));
	button.setLayout(new GridLayout(((Gui_Factory.Kappa.getSize().width)/Constants.SQUARE_SIZE_BIG), ((Gui_Factory.Kappa.getSize().height)/Constants.SQUARE_SIZE_BIG)));
    Gui_Factory.Kappa.add(button);
	
    Gui_Factory.Kappa.add(button);
    
	}
	
}
