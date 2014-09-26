package graphics;

public class Screen {
	
	// this a non JAVA thing, it is for MY convenience
	// these variables are "global varibles" for the class
	private int i, j, k;
	private static int row = 20, column = 100;
	
	// the screen array used for holding
	// char's of data (text graphics)
	private static char[][] theScreen = new char[row][column];

	// screen constructor
	// this constuctor is used for creating the
	// screen used for printing graphics
	// it is by default inizilized to all blank
	// characters
	public Screen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = ' ';
			}
		}
		printScreen();
	}
	
	public void printScreen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				for(k = 0; k <= j; k++) {
					System.out.print(" ");
				}
				System.out.print(theScreen[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public void printAtElement(int c, int r) {
		System.out.print(theScreen[c][r]);
	}
	
	// this method clears the array or the "screen"
	public void clearScreen() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = ' ';
			}
		}
		printScreen();
	}
	
	// this method sets an idividual character to the screen
	public void setElementAt(int c, int r, char ch) {
		theScreen[c][r] = ch;
		printScreen();
	}
	
	public char getElementAt(int c, int r) {
		return theScreen[c][r];
	}
	
	public void setAllElements(char ch) {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				theScreen[i][j] = ch;
			}
		}
		printScreen();
	}

	
	
	
}
