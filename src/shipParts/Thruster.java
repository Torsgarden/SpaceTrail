package shipParts;
import java.util.Random;

public class Thruster extends ShipPart{
	//thrusters will have a medium mass, medium-high cost and low power usage.
	//the function of thrusters is to move the ship
	private int thrust;
	//these values are parameters only; they shouldn't have getters or setters
	private int thrustMin = 50, thrustMax = 1000;
	private int massMin = 200, massMax = 400;
	
	public Thruster() {
		this.rollStats();
	}
	
	public void rollStats() {
		//generates random values for non-preset parts
		Random rand = new Random();
		this.setArmor(rand.nextInt(thrustMax - thrustMin) + thrustMin);
		this.setMass(rand.nextInt(massMax - massMin) + massMin);
		this.calculatePrice();
	}
	
	public int calculatePrice() {
		//TODO: calculate a price
		return this.getPrice();
	}
	
	public int getThrust() {
		return thrust;
	}
	
	public void setArmor(int newThrust) {
		this.thrust = newThrust;
	}
}
