import java.util.Random;

public class Hull extends ShipPart{
	//hulls will have a high mass, medium cost and little/no power usage.
	//the function of hulls is to provide armor
	private int armor;
	//these values are parameters only; they shouldn't have getters or setters
	private int armorMin = 50, armorMax = 500;
	private int massMin = 100, massMax = 1000;
	
	public Hull() {
		this.rollStats();
	}
	
	public void rollStats() {
		Random rand = new Random();
		this.setArmor(rand.nextInt(armorMax - armorMin) + armorMin);
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
