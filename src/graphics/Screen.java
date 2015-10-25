package graphics;

public class Screen implements ScreenInterface {
	
	// variables used in for loops
	private int i, j;
	
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
				try {
					Thread.sleep(1);
					TextWindow.charBoxes[i][j].setText(theScreen[i][j]);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
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
	
	// clears the character at a given location
	public void clearAtElement(int c, int r) {
		theScreen[c][r] = " ";
		TextWindow.charBoxes[c][r].setText(theScreen[c][r]);
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
	
	// this method draws a line of characters
	// line is the line number
	// x is the first point
	// y is the second point
	public void setRowOfElements(int line, int x, int y, String ch) {
		for(i = x; i < y; i++) {
			setElementAt(line, i, ch);
		}
	}
	
	// this method draws a line of characters
	// line is the line number
	// x is the first point
	// y is the second point
	public void setColumnOfElements(int line, int x, int y, String ch) {
		for(i = x; i < y; i++) {
			setElementAt(i, line, ch);
		}
	}
	
	// this method makes a square from the coordinates given
	// x1, y1 are the first point from which will be drawn from
	// x2, y2 are the second point from which will be drawn from
	public void makeSquare(int x1, int y1, int x2, int y2, String ch) {
		setColumnOfElements(x1, y1, y2, ch);
		setColumnOfElements(x2, y1, y2, ch);
		setRowOfElements(y1, x1, x2 + 1, ch);
		setRowOfElements(y2, x1, x2 + 1, ch);
	}
	
	// this method makes a filed square from the coordinates given
	// x1, y1 are the first point from which will be drawn from
	// x2, y2 are the second point from which will be drawn from
	public void makeFiledSquare(int x1, int y1, int x2, int y2, String ch) {
		for(int line = y1; line <= y2; line++) {
			setRowOfElements(line, x1, x2, ch);
		}
	}
	
	
	public void makeDiagonalLine(int x1, int y1, int x2, int y2, String ch) {
		for(int line = y1; line < y2; line++) {
			setElementAt(line + x1, line + x2, ch);
		}
	}
	
	
}
