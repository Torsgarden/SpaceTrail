package shipParts;
import java.util.Random;

public class Shield extends ShipPart{
	/*shields will have a low mass, high cost and high power usage.
	 *the function of shields is to provide an extra defense layer 
	 *(power usage can be increased to recharge shield batteries)
	 */
	private int shield;
	//these values are parameters to help balancing
	private final int shieldMin = 50, shieldMax = 500;
	private final int massMin = 10, massMax = 100;
	
	public Shield() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setShield(rand.nextInt(shieldMax - shieldMin) + shieldMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin);
		this.calculatePrice();
	}
	
	public int calculatePrice() {
		//TODO: calculate a price
		return this.getPrice();
	}
	
	public int getShield() {
		return shield;
	}
	
	public void setShield(int newShield) {
		this.shield = newShield;
	}
}
