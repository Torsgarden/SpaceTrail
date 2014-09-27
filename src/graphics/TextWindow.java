package graphics;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextWindow {
	
	public static JFrame f = new JFrame("Space Trail");
	public static JPanel p = new JPanel();
	private static int i, j;
	private static int row = 21, column = 32;
	public static JTextArea[][] charBoxes = new JTextArea[row][column];
	
	public static void displayWindow() {
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				charBoxes[i][j] = new JTextArea("", 1, 1);
			}
		}
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				charBoxes[i][j].setBackground(Color.white);
				charBoxes[i][j].setEditable(false);
				p.add(charBoxes[i][j], i, j);
			}
		}
		p.setBackground(Color.white);
		f.add(p);
		f.setResizable(false);
		f.setSize(600,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
