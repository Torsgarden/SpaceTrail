package shipParts;
import java.util.Random;

public class Shield extends ShipPart{
	/*shields will have a low mass, very high cost and high power usage.
	 *the function of shields is to provide an extra defense layer 
	 *(power usage can be increased to recharge shield batteries)
	 */
	private int shield;
	//these values are parameters to help balancing
	private int pUseMin = 300, pUseMax = 1200;
	private final int shieldMin = 50, shieldMax = 500;
	private final int massMin = 10, massMax = 100;
	//TODO: recharge rate or efficiency on shields (maybe)
	
	public Shield() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setShield(rand.nextInt(shieldMax - shieldMin) + shieldMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin);
		this.setPowerUse(rand.nextInt(pUseMax - pUseMin) + pUseMin);
		this.calculatePrice();
	}
	
	public void calculatePrice() {
		//shields are expensive as fuck. this is intentional
		setPrice( 4 * ( (shield * 10 ) + (this.getPowerUse() / 2) )  );
	}
	
	public int getShield() {
		return shield;
	}
	
	public void setShield(int newShield) {
		this.shield = newShield;
	}
}
