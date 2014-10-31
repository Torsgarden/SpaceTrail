import shipParts.*;

public class Main {
	public static void main(String[] args) {
		CrewMember testMember = new CrewMember();
		Ship testShip = new Ship();
		testShip.outputSpecs();
		
		//System.out.println(testShip.getName());
		//System.out.println(testMember.showInfo() + "\nHire Cost: " + testMember.getHireCost());
		Thruster newThruster = new Thruster();
		System.out.println("Thrust Power: " + newThruster.getThrust() + "\nPrice: " + newThruster.getPrice() );
		
		//TODO: Cheese moons, space cows(?), space bison, space pirates, firefly references, enemy finches;
	}
}