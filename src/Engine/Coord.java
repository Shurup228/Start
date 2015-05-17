/**
 * 
 */
package Engine;

import java.awt.*;
import Engine.*;
import Util.*;

/**
 * @author Ярик
 *Тот самый коордиатный главный класс
 */
public class Coord {
		
		public static int getCoordX(int x) {
			
			int squareX;
			
			squareX = (x*Constants.SQUARE_SIZE_BIG) - Constants.SQUARE_SIZE_BIG/2;
			
			return squareX;
		}
		
		public static int getCoordY(int y) {
			
			int squareY;
			
			squareY = (y*Constants.SQUARE_SIZE_BIG) - Constants.SQUARE_SIZE_BIG/2;
			
			return squareY;
			
		}

}
