/**
 * 
 */
package Engine;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import Engine.Gui_Factory;

/**
 * @author Ярик
 *Тот самый коордиатный главный класс
 */
public class Coord {
	
		public static void Fill_Screen() {
			
			JPanel Panel = new JPanel();
			Panel.setBackground(Color.BLACK);
			Panel.setLayout(new FlowLayout());
			
			Gui_Factory.Kappa.add(Panel);
			
		}
}
