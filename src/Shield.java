import java.util.Random;

public class Shield extends ShipPart{
	/*shields will have a low mass, high cost and high power usage.
	 *the function of shields is to provide an extra defense layer 
	 *(power usage can be increased to recharge shield batteries)
	 */
	private int armor;
	//these values are parameters only; they shouldn't have getters or setters
	private int shieldMin = 50, shieldMax = 500;
	private int massMin = 10, massMax = 100;
	
	public Shield() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setArmor(rand.nextInt(shieldMax - shieldMin) + shieldMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin);
		this.calculatePrice();
	}
	
	public int calculatePrice() {
		//TODO: calculate a price
		return this.getPrice();
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int newArmor) {
		this.armor = newArmor;
	}
}
