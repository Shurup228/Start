package Engine;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Этот класс будет создавать окно
public class Gui_Factory {
	
	public static JFrame Kappa = new JFrame("Kappa");//Создаем обьект класса JFrame
	
	public static void createWindow() {
		
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Говорим, что программа завершается при закрытии окна
		
		Kappa.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Kappa.setVisible(true);//Все и так ясно(Okno delayetsya visibilnim)
		
	}
	
	public static void createPanel() {
		
		JPanel Panel = new JPanel();
		
		Panel.setSize(Kappa.getSize().width, Kappa.getSize().height);
		
		Kappa.add(Panel);
		
	}
	
	public static JPanel createPanel(int x, int y) {
		
		JPanel Panel = new JPanel();
		
		Panel.setSize(Coord.getSizeBig(x), Coord.getSizeBig(y));
		
		Kappa.add(Panel);
		
		return Panel;
		
	}

}
