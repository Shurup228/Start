package Engine;

import javax.swing.*;

public class Button {
	
	public static ButtonGroup Button_Group = new ButtonGroup();
	
	public static void CreateButton(int x, int y, int x1, int y1, String name) {
		
	JPanel Button_Panel = new JPanel();
	Button_Panel.setLocation(Coord.getCoordBig(x), Coord.getCoordBig(y));
	Button_Panel.setSize(Coord.getSizeBig(x1), Coord.getSizeBig(y1));
	
    JButton button = new JButton(name);
    button.setLocation(Coord.getCoordBig(x), Coord.getCoordBig(y));
    button.setSize(Coord.getSizeBig(x1), Coord.getSizeBig(y1));
	button.setLayout(null);
	
	Button_Panel.add(button);
	Gui_Factory.Kappa.add(Button_Panel);
    
	}
	
}
