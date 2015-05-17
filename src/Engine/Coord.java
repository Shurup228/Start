/**
 * 
 */
package Engine;

import java.awt.*;
import javax.swing.JPanel;
import Engine.*;

/**
 * @author Ярик
 *Тот самый коордиатный главный класс
 */
public class Coord {

		public static void Draw_Grid(int x, int y ,int z) {
			
			JPanel Panel = new JPanel();//Создаем область для отрисовки
			Panel.setBackground(Color.getHSBColor(x, y, z));//Ставим цвет фона
			Panel.setLayout(new FlowLayout());//Новый слой
			
			Gui_Factory.Kappa.add(Panel);//Добавляем в главное окно созданную раннее область

		}
		
		public static int getCoordX(int x) {
			
			int squareX;
			
			squareX = (x*32) - 16;
			
			return squareX;
		}
		
		public static int getCoordY(int y) {
			
			int squareY;
			
			squareY = (y*32) - 16;
			
			return squareY;
			
		}

}
