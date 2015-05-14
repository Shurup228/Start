/**
 * 
 */
package Engine;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

import Engine.Gui_Factory;

/**
 * @author Ярик
 *Тот самый коордиатный главный класс
 */
public class Coord {
	
		public static void Fill_Screen(int x, int y ,int z) {
			
			JPanel Panel = new JPanel();
			Panel.setBackground(Color.getHSBColor(x, y, z));
			Panel.setLayout(new FlowLayout());
			
			Gui_Factory.Kappa.add(Panel);
			
		}
		
		public static void Draw_Grid(Graphics g) {
			
			super.Draw_Grid(g);
			
		}
}
