package Engine;

import javax.swing.JFrame;

//Этот класс будет создавать окно
public class Gui_Factory extends Coord {
	
	public static JFrame Kappa = new JFrame("Kappa");//Создаем обьект класса JFrame
	
	public static void createWindow() {
		
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Говорим, что программа завершается при закрытии окна
		
		Kappa.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Kappa.setVisible(true);//Все и так ясно(Okno delayetsya visibilnim)
		
	}
	
	public static void createPanel() {
		
		
		
	}

}
