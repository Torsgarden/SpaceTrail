package shipParts;
import java.util.Random;

public class CargoBay extends ShipPart {
	//cargo bays will have a relatively low mass, semi-high cost and low power usage.
	//the function of cargo bays is to store supplies (based on supply volume vs available capacity
	private int capacity;
	//these values are parameters only; they shouldn't have getters or setters
	private int capacityMin = 100, capacityMax = 1000;
	private int pUseMin = 10, pUseMax = 100;
	private int massMin = 10, massMax = 100;
	
	public CargoBay() {
		this.rollStats();
	}
	
	public CargoBay(int con) {
		//example method for preset parts
		//TODO: make this not an example method
		switch(con) {
			case 0: 
				this.rollStats();
				break;
			case 1:
				capacity = 150;
				setMass(20);
			case 2:
				capacity = 300;
				setMass(40);
			case 3:
				capacity = 450;
				setMass(60);
			default:
				capacity = 10;
				setMass(1);
		}
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setCapacity(rand.nextInt(capacityMax - capacityMin) + capacityMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin);
		this.setPowerUse(rand.nextInt(pUseMax - pUseMin) + pUseMin);
		this.calculatePrice();
	}
	
	public void calculatePrice() {
		setPrice( capacity * 6 );
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int newCapacity) {
		this.capacity = newCapacity;
	}
}