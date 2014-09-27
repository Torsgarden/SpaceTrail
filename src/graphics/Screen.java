package graphics;

public class Screen {
	
	// this a non JAVA thing, it is for MY convenience
	// these variables are "global varibles" for the class
	private int i, j, k;
	private static int row = 21, column = 32;
	
	// the screen array used for holding
	// char's of data (text graphics)
	private static String[][] theScreen = new String[row][column];

	// screen constructor
	// this constuctor is used for creating the
	// screen used for printing graphics
	// it is by default inizilized to all blank
	// characters
	public Screen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = " ";
			}
		}
		printScreen();
	}
	
	public void printScreen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				TextWindow.charBoxes[i][j].insert(theScreen[i][j], 0);
				//TextWindow.t.setCaretPosition(j);
				//TextWindow.charBoxes[i][j].insert(theScreen[i][j], 0);
				//TextWindow.t.setText(theScreen[i][j]);
				//for(k = 0; k <= j; k++) {
				
					//System.out.print(" ");
				//}
				//System.out.print(theScreen[i][j]);
			}
			//TextWindow.t.insert("\n", j);
			//System.out.print("\n");
		}
	}
	
	public void printAtElement(int c, int r) {
		System.out.print(theScreen[c][r]);
	}
	
	// this method clears the array or the "screen"
	public void clearScreen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = " ";
			}
		}
		printScreen();
	}
	
	// this method sets an idividual character to the screen
	public void setElementAt(int c, int r, String ch) {
		theScreen[c][r] = ch;
		printScreen();
	}
	
	public String getElementAt(int c, int r) {
		return theScreen[c][r];
	}
	
	public void setAllElements(String ch) {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = ch;
			}
		}
		printScreen();
	}

	
	
	
}
