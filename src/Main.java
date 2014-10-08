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
		
		while(true) {
			myScreen.setAllElements("*");
			myScreen.setAllElements(" ");
		}
		
	}
}
