package shipParts;

import java.util.Random;

public class CrewQuarters extends ShipPart {
	//crew quarters will have a relatively low mass, medium-high cost and medium power usage.
	//the function of crew quarters is to increase crew capacity
	private int capacity = 100;
	//these values are parameters only; they shouldn't have getters or setters
	private int capMin = 1, capMax = 10;
	private int pUseMin = 50, pUseMax = 500;
	private int massMin = 100, massMax = 300;
	
	public CrewQuarters() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setCapacity(rand.nextInt(capMax - capMin) + capMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin);
		this.setPowerUse(rand.nextInt(pUseMax - pUseMin) + pUseMin);
		this.calculatePrice();
	}
	
	public void calculatePrice() {
		//TODO: find better CQ price formula
		setPrice( (capacity * 1000) - ( getMass() / 2 ) );
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int newCapacity) {
		this.capacity = newCapacity;
	}
		
}
