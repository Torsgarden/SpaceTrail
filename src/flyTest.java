import java.util.Random;
import java.util.Scanner;

public class flyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int con = 0;
		long distance;
		Ship testShip = new Ship();
		CrewMember current = new CrewMember();
		while (con != 1) {
			testShip = new Ship();
			testShip.outputSpecs();
			
			System.out.println("\n1. Use this ship\n2. Find another ship");
			con = scan.nextInt();
		}
		//ship has been picked, continue to next segment of code
		con = 0;
		while (con != 1) {
			current = new CrewMember();
			System.out.println(current.showInfo());
			System.out.println("\n1. Hire this captain\n2. Find someone else");
			con = scan.nextInt();
		}
		testShip.captain = current;
		//captain picked, move to navigator
		con = 0;
		while (con != 1) {
			current = new CrewMember();
			System.out.println(current.showInfo());
			System.out.println("\n1. Hire this navigator\n2. Find someone else");
			con = scan.nextInt();
		}
		testShip.navigator = current;
		//navigator has been picked, move on to next block
		
		System.out.println("\nPrepared to embark. How far are you going?");
		distance = scan.nextLong();
		scan.close();
		
		int turn = 0, events = 0;
		while(distance > 0) {
			turn++;
			if (rand.nextInt(20) == 7) {
				System.out.println("[Excitement goes here]");
				events++;
			}
			distance -= testShip.getSpeed();
			System.out.println("Distance remaining: " + distance);
		}
		System.out.println("You made it to your destination in " + turn + " turns and had " + events + " incidents of excitement along the way.");
		
	}	
}
