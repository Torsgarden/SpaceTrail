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
	
	
}
