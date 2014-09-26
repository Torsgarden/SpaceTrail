import java.util.Random;

public class Engine extends ShipPart {
	//engines will have a relatively low mass, high cost and little/no power usage.
	//the function of engines is to produce power
	private int powerOutput;
	//these values are parameters only; they shouldn't have getters or setters
	private int pOutMin = 100, pOutMax = 1000;
	private int massMin = 10, massMax = 100;
	
	public Engine() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setPowerOutput(rand.nextInt(pOutMax - pOutMin) + pOutMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin); 
		this.calculatePrice();
	}
	
	public int calculatePrice() {
		//TODO: calculate a price
		return this.getPrice();
	}

	public int getPowerOutput() {
		return powerOutput;
	}

	public void setPowerOutput(int powerOutput) {
		this.powerOutput = powerOutput;
	}
}