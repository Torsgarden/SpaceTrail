package graphics;

public class Screen {
	
	// this a non JAVA thing, it is for MY convenience
	// these variables are "global varibles" for the class
	private int i, j;
	private static int row = 20, column = 40;
	
	// the screen array used for holding
	// char's of data (text graphics)
	// and is only made to take 1 character, even though it is a string
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
	
	// prints the whole array to the screen
	public void printScreen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				TextWindow.charBoxes[i][j].setText(theScreen[i][j]);
			}
		}
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
	
	// sets an idividual character to the screen
	public void setElementAt(int c, int r, String ch) {
		theScreen[c][r] = ch;
		TextWindow.charBoxes[c][r].setText(theScreen[c][r]);
	}
	
	// gets the elements at a location in the array
	public String getElementAt(int c, int r) {
		return theScreen[c][r];
	}
	
	// sets all the elements on the screen into one character
	public void setAllElements(String ch) {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = ch;
			}
		}
		printScreen();
	}

}
