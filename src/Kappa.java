/**
 * 
 */
import Engine.Gui_Factory;
import Engine.Coord;
import Engine.Button;
import Util.Game_Tick;
import java.awt.*;
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

				
				  Gui_Factory.CreateWindow(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/2);
				  //Coord.Draw_Grid(1, 1, 3999999);
				  Button.CreateButton(1,1,1,1);
				  Game_Tick.gameTick();

	}

}
