import graphics.DisplayGraphics;
import graphics.Screen;
import graphics.TextWindow;

public class Main {
	public static void main(String[] args) {
		// this line MUST be first or else everything else will fail
		// this sets up the window for display
		TextWindow.displayWindow();
		// create a screen so that you can insert characters into the array
		// that is then printed into the TextWindow
		Screen myScreen = new Screen();
		//DisplayGraphics.printMovingLine(myScreen);
		//DisplayGraphics.printRandomElements(myScreen, 10, "*");
		
		int i, j = 8;
		while(true) {
			try {
				for(i = 0 ; i < 36; i++) {
					DisplayGraphics.printBats(myScreen, i, j, "*");
					Thread.sleep(200);
					DisplayGraphics.printBats(myScreen, i, j, " ");
					DisplayGraphics.printBatsReverse(myScreen, i, j, "*");
					Thread.sleep(200);
					DisplayGraphics.printBatsReverse(myScreen, i, j, " ");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
		//myScreen.makeSquare(0, 0, 39, 19, "*");
		//myScreen.makeSquare(3, 3, 36, 16, "*");
		//myScreen.makeSquare(6, 6, 33, 13, "*");
		//myScreen.setColumnOfElements(5, 4, 10, "*");
		//myScreen.makeFiledSquare(6, 6, 33, 13, "*");
		//myScreen.makeDiagonalLine(0, 0, 10, 10, "*");
		
		/*
		while(true) {
			myScreen.setAllElements("*");
			myScreen.setAllElements(" ");
		}
		*/
	}
}
