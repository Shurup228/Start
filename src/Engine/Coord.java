/**
 * 
 */
package Engine;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JPanel;
import Engine.Gui_Factory;

/**
 * @author Ярик
 *Тот самый коордиатный главный класс
 */
public class Coord {
		
		public static void Fill_Screen(int x, int y) {
			
			JPanel Panel = new JPanel();
			Panel.setBackground(Color.cyan);
			Panel.setLayout(new FlowLayout());
			
			Gui_Factory.Kappa.add(Panel);
			
		}
}
