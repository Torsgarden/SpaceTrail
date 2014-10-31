package shipParts;
import java.util.Random;

public class Reactor extends ShipPart {
	//reactors will have a relatively low mass, high cost and negative net power usage.
	//the function of reactors is to produce power
	private int powerOutput = 100;
	//these values are parameters only; they shouldn't have getters or setters
	private int pUseMin = 5, pUseMax = 10;
	private int pOutMin = 300, pOutMax = 1500;
	private int massMin = 10, massMax = 100;
	
	public Reactor() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setPowerOutput(rand.nextInt(pOutMax - pOutMin) + pOutMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin); 
		this.setPowerUse(rand.nextInt(pUseMax - pUseMin) + pUseMin);
		this.calculatePrice();
	}
	
	public void calculatePrice() {
		//reactors are a bit costly
		setPrice(powerOutput * 10);
	}

	public int getPowerOutput() {
		return powerOutput;
	}

	public void setPowerOutput(int newPowerOutput) {
		this.powerOutput = newPowerOutput;
	}
}