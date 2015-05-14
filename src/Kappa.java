/**
 * 
 */
import Engine.Gui_Factory;
import Engine.Coord;
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

		  javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				  Gui_Factory.CreateWindow(800, 600);
				  Coord.Fill_Screen(10, 100, 4000000);
				
			}
		  });

	}

}
