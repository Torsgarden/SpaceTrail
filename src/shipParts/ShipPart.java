package shipParts;
//import java.util.Random;

public abstract class ShipPart {
	private int mass, powerUse = 5, volume, price = 100;

	/*	
	public static Object randomizePart() {
		Random rand = new Random();
		//Object newPart = new Object();
		
		//TODO: finish randomizePart method
		switch(rand.nextInt(3)) {
			case 1:
				//return engines
				return new Engine();
				break;
			case 2:
				//return thrusters
				break;
			default:
				//you should never reach this code
				break;
		}
		return newPart;
	}
	*/
	
	public int getMass() {
		return mass;
	}
	
	public void setMass(int newMass) {
		mass = newMass;
	}
	
	public int getPowerUse() {
		return powerUse;
	}
	
	public void setPowerUse(int newPowerUse) {
		powerUse = newPowerUse;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int newVolume) {
		volume = newVolume;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	
}