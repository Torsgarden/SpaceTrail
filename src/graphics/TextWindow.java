package graphics;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextWindow {
	
	// the text for the window
	public static JFrame f = new JFrame("Space Trail");
	// a panel for inserting text areas into
	public static JPanel p = new JPanel();
	// a non JAVA thing, more for convinience
	private static int i, j;
	private static int row = 20, column = 40;
	// creates character boxes which are then used
	// in the Screen class for printing
	public static JTextArea[][] charBoxes = new JTextArea[row][column];
	
	// creates the main window
	public static void displayWindow() {
		// creates text area boxes and puts them into the charBoxes array
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				charBoxes[i][j] = new JTextArea("", 1, 1);
			}
		}
		// inizilises the default value for all of the text boxes
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				charBoxes[i][j].setBackground(Color.white);
				charBoxes[i][j].setEditable(false);
				p.add(charBoxes[i][j], 0, -1);
			}
		}
		
		p.setBackground(Color.white);
		f.add(p);
		f.setResizable(false);
		f.setSize(660,460);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
