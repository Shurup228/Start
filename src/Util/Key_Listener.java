package Util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Listener implements KeyListener {
	
	KeyEvent e;
	
	public void keyPressed(KeyEvent arg0) {
		displayInfo(e, "KEY PRESSED: ");
	}


	public void keyReleased(KeyEvent arg0) {

		displayInfo(e, "KEY RELEASED: ");
	}

	
	 private void displayInfo(KeyEvent e, String keyStatus){
	        int id = e.getID();
	        String keyString;
	         int keyCode = e.getKeyCode();
	            keyString = "key code = " + keyCode
	                    + " ("
	                    + KeyEvent.getKeyText(keyCode)
	                    + ")";
	        
	            String actionString = "action key? ";
	            if (e.isActionKey()) {
	                actionString += "YES";
	            } else {
	                actionString += "NO";
	            }
	 }
	

	public void keyTyped(KeyEvent arg0) {
		
	}
		
	
}