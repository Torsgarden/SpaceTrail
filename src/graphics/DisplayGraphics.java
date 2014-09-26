package graphics;

import java.util.concurrent.TimeUnit;

public class DisplayGraphics {
	
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
	
	
	
	
	
}
