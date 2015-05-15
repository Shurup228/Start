package Util;

import java.util.Timer;
import java.util.TimerTask;
import AI.Artificial_Intelegiance;
import Engine.Button;

public class Game_Tick extends TimerTask{
	
	public static void gameTick()
	{
		Game_Tick task = new Game_Tick();
		Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);      
	}

	public void run() {
		System.out.println("Ticking");
		Artificial_Intelegiance.aggroCheck();
		
	}

}
