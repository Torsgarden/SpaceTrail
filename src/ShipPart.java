import java.util.Random;

public abstract class ShipPart {
	private int mass, powerUse, volume, price;
	
public static Object randomizePart() {
	Random rand = new Random();
	Object newPart = new Object();
	
	//TODO: finish randomizePart method once part subclasses have been made
	switch(rand.nextInt(3)) {
		case 1:
			//return engines
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
	
	public int getMass() {
		return mass;
	}
	
	public void setMass(int newMass) {
		this.mass = newMass;
	}
	
	public int getPowerUse() {
		return powerUse;
	}
	
	public void setPowerUse(int newPowerUse) {
		this.powerUse = newPowerUse;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int newVolume) {
		this.volume = newVolume;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
}