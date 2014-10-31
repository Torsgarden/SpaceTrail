package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextWindow implements ScreenInterface {
	
	// the text for the window
	public static JFrame f = new JFrame("Space Trail");
	// a panel for inserting text areas into
	public static JPanel p = new JPanel();
	// variables used in for loops
	private static int i, j;
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
				charBoxes[i][j].setBackground(Color.black);
				charBoxes[i][j].setEditable(false);
				charBoxes[i][j].setCaretColor(Color.white);
				p.add(charBoxes[i][j], 0, -1);
			}
		}
		
		// set various properties on the window
		p.setBackground(Color.black);
		f.add(p);
		f.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation((dim.width-660)/2, (dim.height-460)/2);
		f.setSize(660,460);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
