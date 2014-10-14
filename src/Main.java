import graphics.DisplayGraphics;
import graphics.Screen;
import graphics.TextWindow;

public class Main {
	public static void main(String[] args) {
		// this line MUST be first or else everything else will fail
		TextWindow.displayWindow();
		// create a screen so that you can insert characters into the array
		// that is then printed into the TextWindow
		Screen myScreen = new Screen();
		//myScreen.makeSquare(0, 0, 39, 19, "*");
		//myScreen.makeSquare(3, 3, 36, 16, "*");
		//myScreen.makeSquare(6, 6, 33, 13, "*");
		//myScreen.setColumnOfElements(5, 4, 10, "*");
		myScreen.makeFiledSquare(6, 6, 33, 13, "*");
		/*
		while(true) {
			myScreen.setAllElements("*");
			myScreen.setAllElements(" ");
		}
		*/
	}
}
