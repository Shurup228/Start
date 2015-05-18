/**
 * 
 */
import javax.swing.JButton;

import Engine.*;
/**
 * @author ярик
 *√лавный класс
 *
 */
public class Kappa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

				
				  Gui_Factory.createWindow();
				  JButton button1 = Button.CreateButtonSized(20, 10, 5, 3, "Lol", true);
				  JButton button2 = Button.CreateButtonSized(2 , 1, 2, 2, "Kappa", true);
				  
				  for(int i = 0; i == 2; i++) {
					  
					  button1.repaint();
					  button2.repaint();
					  
				  }

	}

}
