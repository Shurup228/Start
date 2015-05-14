package Engine;

import java.awt.Dimension;
import javax.swing.JFrame;

//Этот класс будет создавать окно
public class Gui_Factory extends Coord {
	
	public static JFrame Kappa = new JFrame("Kappa");//Создаем обьект класса JFrame
	
	public static void CreateWindow(int x, int y) {
		
		//JFrame.setDefaultLookAndFeelDecorated(true);
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Говорим, что программа завершается при закрытии окна
		
		Kappa.setPreferredSize(new Dimension(x, y));//Предпочитаемый размер
		
		Kappa.pack();//Окно в рамке, а не полноэкраный режим
		Kappa.setVisible(true);//Все и так ясно(Okno delayetsya visibilnim)
		
	}

}
