import graphics.DisplayGraphics;
import graphics.Screen;
import graphics.TextWindow;

public class Main {
	public static void main(String[] args) {
		TextWindow.displayWindow();
		//DisplayGraphics.titleScreen();
		//DisplayGraphics.printSpace();
		Screen myScreen = new Screen();
		myScreen.setAllElements("*");
		//for(int i = 0; i < 20; i++) {
		//	myScreen.setElementAt(i, i*2, "*");
		//}
		//myScreen.setElementAt(0, 0, "*");
		//myScreen.setElementAt(0, 0, "*");
		//myScreen.setElementAt(0, 0, "*");
		
		/*
		CrewMember testMember = new CrewMember();
		Ship testShip = new Ship();
		System.out.println(testShip.getName());
		//System.out.println(testMember.showInfo() + "\nHire Cost: " + testMember.getHireCost());
		//TODO: Cheese moons, space cows(?), space bison, space pirates, firefly references, enemy finches;
		*/
	}
}
