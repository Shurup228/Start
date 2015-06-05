package Engine;

//import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.*;

public class Button {
	
	public static JButton CreateButtonSized(int x, int y, int x1, int y1, String name, boolean visible) {
		
	JPanel Button_Panel = new JPanel();
	Button_Panel.setLayout(new BorderLayout()); 
	Button_Panel.setLocation(Coord.getCoordBig(x), Coord.getCoordBig(y));
	Button_Panel.setSize(Coord.getSizeBig(x1), Coord.getSizeBig(y1));
	//Button_Panel.setVisible(true);
	//Button_Panel.setBackground(Color.WHITE);
	
    JButton button = new JButton(name);
    
    button.setVisible(visible);
	
	Gui_Factory.Kappa.add(Button_Panel);
	Button_Panel.add(button, BorderLayout.CENTER);
    
	return button;
	
	}
	
}
