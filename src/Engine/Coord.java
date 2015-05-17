/**
 * 
 */
package Engine;

import Util.*;

/**
 * @author Ярик
 *Тот самый коордиатный главный класс
 */
public class Coord {
		
		public static int getCoordBig(int x) {
			
			int SquareCenter;
			
			SquareCenter = (x*Constants.SQUARE_SIZE_BIG) - Constants.SQUARE_SIZE_BIG/2;
			
			return SquareCenter;
		}

		public static int getSizeBig(int x) {
			
			int SquareSize;
			
			SquareSize = Constants.SQUARE_SIZE_BIG*x;
			
			return SquareSize;
			
		}
		
		public static int getCoordSmall(int x) {
			
			int SquareCenter;
			
			SquareCenter = (x*Constants.SQUARE_SIZE_SMALL) - Constants.SQUARE_SIZE_SMALL/2;
			
			return SquareCenter;
		}
		
		public static int getSizeSmall(int x) {
			
			int SquareSize;
			
			SquareSize = Constants.SQUARE_SIZE_SMALL*x;
			
			return SquareSize;
			
		}
}
