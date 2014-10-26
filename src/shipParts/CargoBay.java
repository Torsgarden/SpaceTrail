package shipParts;
import java.util.Random;

public class CargoBay extends ShipPart {
	//cargo bays will have a relatively low mass, semi-high cost and low power usage.
	//the function of cargo bays is to store supplies (based on supply volume vs available capacity
	private int capacity;
	//these values are parameters only; they shouldn't have getters or setters
	private int capacityMin = 100, capacityMax = 1000;
	private int massMin = 10, massMax = 100;
	
	public CargoBay() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setPowerOutput(rand.nextInt(capacityMax - capacityMin) + capacityMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin); 
		this.calculatePrice();
	}
	
	public int calculatePrice() {
		//TODO: calculate a price
		return this.getPrice();
	}

	public int getCapacity() {
		return capacity;
	}

	public void setPowerOutput(int newCapacity) {
		this.capacity = newCapacity;
	}
}