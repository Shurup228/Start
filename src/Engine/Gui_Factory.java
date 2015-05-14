package Engine;

import java.awt.Dimension;
import javax.swing.JFrame;
//Этот класс будет создавать окно
public class Gui_Factory extends Coord {
	
	public static void CreateWindow(int x, int y) {
		
		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Window = new JFrame("Kappa");//Создаем обьект класса JFrame
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Говорим, что программа завершается при закрытии окна
		
		Window.setPreferredSize(new Dimension(x, y));//Предпочитаемый размер
		
		Window.pack();//Окно в рамке, а не полноэкраный режим
		Window.setVisible(true);//Все и так ясно(Okno delayet visibilnim)
		
	}

}
