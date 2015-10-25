package graphics;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DisplayGraphics implements ScreenInterface{
	
	public static void titleScreen() {
		System.out.println(" / ========== ========== ========== ========== ========== \\ ");
		System.out.println(" |   ______     ______                 ______    ______    |");
		System.out.println(" |  /          |      |      /\\       |         |          |");
		System.out.println(" |  |          |      |     /  \\      |         |          |");
		System.out.println(" |  \\______    |______|    /    \\     |         |______    |");
		System.out.println(" |         \\   |          /______\\    |         |          |");
		System.out.println(" |         |   |         /        \\   |         |          |");
		System.out.println(" |   ______/   |        /          \\  |______   |______    |");
		System.out.println(" |                                                         |");
		System.out.println(" |   ________   ______                _______              | ");
		System.out.println(" |      |      |      |       /\\         |      |          | ");
		System.out.println(" |      |      |      |      /  \\        |      |          |");
		System.out.println(" |      |      |______|     /    \\       |      |          |");
		System.out.println(" |      |      |     \\     /______\\      |      |          |");
		System.out.println(" |      |      |      \\   /        \\     |      |          |");
		System.out.println(" |      |      |       \\ /          \\ ___|____  |______    |");
		System.out.println(" |                                                         | ");
		System.out.println(" \\ ========== ========== ========== ========== ========== / ");
	}
	
	public static void clearScreen() {
		
		System.out.print("\r");
	}
	
	public static void printSpace() {
		int i, j;
		try {
			for(i = 0; i < 10000; i++) {
				TimeUnit.MICROSECONDS.sleep(10000);
				for(j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				System.out.print("*\r");
				//System.out.print("\r");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	// this method prints a line moving from the top
	// of the screen to the bottom of the screen
	// screen is the screen printed too
	// ch is the character printed
	public static void printMovingLine(Screen screen, String ch) {
		while(true) {
		for(int i = 0; i <= 19; i++) {
			try {
				screen.setRowOfElements(i, 0, 40, ch);
				Thread.sleep(100);
				screen.setRowOfElements(i, 0, 40, " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}
	
	// this method randomly generates characters to the screen
	// until it gets completely filled in with the character
	// screen is the screen printed too
	// rate is how fast the screen will get filled
	// ch is the character printed
	public static void printRandomFill(Screen screen, int rate, String ch) {
		while(true) {
			try {
				int x, y;
				Random r1 = new Random();
				x = r1.nextInt(row);
				y = r1.nextInt(column);
				screen.setElementAt(x, y, ch);
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// this method randomly generates a certain number of characters
	// to the screen based on the arguments 
	// screen is the screen printed too
	// num is how many characters will be printed at a time
	// ch is the character printed
	public static void printRandomElements(Screen screen, int num, String ch) {
		while(true) {
			try {
				int[] xArray = new int[num];
				int[] yArray = new int[num];
				Random r1 = new Random();
				for(int i = 0; i < num; i++) {
					xArray[i] = r1.nextInt(row);
					yArray[i] = r1.nextInt(column);
					screen.setElementAt(xArray[i], yArray[i], ch);
				}
				Thread.sleep(100);
				for(int i = 0; i< num; i++) {
					screen.setElementAt(xArray[i], yArray[i], " ");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void printMovingSquare(Screen screen) {
		screen.makeFiledSquare(6, 6, 18, 10, "*");
		while(true) {
			try {
				for(int i = 1; i <= 10; i++) {
					screen.setColumnOfElements(17+i, 6, 11, "*");
					screen.setColumnOfElements(5+i, 6, 11, " ");
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// this method creates a character that is 5 by 5
	// screen is the screen printed too
	// letter is the letter to be printed
	// ch is the character to be printed
	// x is the x cordiante of the top left corner
	// y is the y cordiante of the top left corner
	public static void printCharacters(Screen screen, char letter, String ch, int x, int y) {
		switch(letter) {
			case 's':
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x, y + 1, y + 3, ch);
				screen.setRowOfElements(y + 2, x, x + 5, ch);
				screen.setColumnOfElements(x + 4, y + 3, y + 5, ch);
				screen.setRowOfElements(y + 4, x, x + 5, ch);
				break;
			case 'p':
				screen.setColumnOfElements(x, y, y + 5, ch);
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x + 4, y, y + 3, ch);
				screen.setRowOfElements(y + 2, x, x + 5, ch);
				break;
			case 'a':
				screen.setElementAt(y, x + 2, ch);
				screen.setElementAt(y + 1, x + 1, ch);
				screen.setElementAt(y + 1, x + 3, ch);
				screen.setColumnOfElements(x, y + 2, y + 5, ch);
				screen.setColumnOfElements(x + 4, y + 2, y + 5, ch);
				screen.setRowOfElements(y + 2, x + 1, x + 4, ch);
				break;
			case 'c':
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x, y, y + 5, ch);
				screen.setRowOfElements(y + 4, x, x + 5, ch);
				break;
			case 'e':
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x, y, y + 5, ch);
				screen.setRowOfElements(y + 2, x, x + 5, ch);
				screen.setRowOfElements(y + 4, x, x + 5, ch);
				break;
			case 't':
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x + 2, y, y + 5, ch);
				break;
			case 'r':
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x, y, y + 5, ch);
				screen.setRowOfElements(y + 2, x, x + 5, ch);
				screen.setElementAt(y + 1, x + 4, ch);
				screen.setElementAt(y + 3, x + 3, ch);
				screen.setElementAt(y + 4, x + 4, ch);
				break;
			case 'l':
				screen.setColumnOfElements(x, y, y + 4, ch);
				screen.setRowOfElements(y + 4, x, x + 5, ch);
				break;
			case 'i':
				screen.setRowOfElements(y, x, x + 5, ch);
				screen.setColumnOfElements(x + 2, y + 1, y + 4, ch);
				screen.setRowOfElements(y + 4, x, x + 5, ch);
				break;
			default:
				break;
		}
	}
	
	// this method creates the space trail logo
	// screen is the screen printed too
	// ch is the characters that will be printed
	// x is the x cordiante of the top left corner
	// y is the y cordiante of the top left corner
	public static void printLogo(Screen screen, String ch, int x, int y) {
		printCharacters(screen, 's', ch, x, y);
		printCharacters(screen, 'p', ch, x + 6, y);
		printCharacters(screen, 'a', ch, x + 12, y);
		printCharacters(screen, 'c', ch, x + 18, y);
		printCharacters(screen, 'e', ch, x + 24, y);
		
		printCharacters(screen, 't', ch, x, y + 6);
		printCharacters(screen, 'r', ch, x + 6, y + 6);
		printCharacters(screen, 'a', ch, x + 12, y + 6);
		printCharacters(screen, 'i', ch, x + 18, y + 6);
		printCharacters(screen, 'l', ch, x + 24, y + 6);
	}
	
	public static void printBats(Screen screen, int x, int y, String ch) {
		screen.setElementAt(y, x + 2, ch);
		screen.setElementAt(y + 1, x + 1, ch);
		screen.setElementAt(y + 1, x + 3, ch);
		screen.setElementAt(y + 2, x, ch);
		screen.setElementAt(y + 2, x + 4, ch);
	}
	
	public static void printBatsReverse(Screen screen, int x, int y, String ch) {
		screen.setElementAt(y, x, ch);;
		screen.setElementAt(y + 2, x + 2, ch);
		screen.setElementAt(y + 1, x + 1, ch);
		screen.setElementAt(y + 1, x + 3, ch);
		screen.setElementAt(y, x + 4, ch);
	}
	
}
