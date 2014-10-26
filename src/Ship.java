import java.util.ArrayList;
import shipParts.*;
//import weapon.*;

public class Ship {
	private int health = 1, powerOut = 0, powerUse = 0, mass = 0, thrust = 0, price = 0;
	//PartsList functions as an array of parts in use
	PartsList pL = new PartsList();
	//array lists for active parts and crew
	ArrayList<CrewMember> activeCrew = new ArrayList<CrewMember>();
	
	//TODO: placeholder refs for captain, nav, etc.
	
	public Ship() {
		this.calcSpecs();
	}
	
	public void calcSpecs() {
		this.mass = pL.calcMass();
		this.powerUse = pL.calcPowerUse();
		this.powerOut = pL.calcPowerOutput();
	}
	
	public String getSpecsString() {
		String output = ("Mass: " + mass + "\nPower Usage: " + powerUse + "\nPower Generation: " + powerOut);
		//TODO: change specs string as more ship parts are added
		return output;
	}
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

	public int getPowerOut() {
		return powerOut;
	}
	public void setPowerOut(int powerOut) {
		this.powerOut = powerOut;
	}

	public int getPowerUse() {
		return powerUse;
	}
	public void setPowerUse(int powerUse) {
		this.powerUse = powerUse;
	}

	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getThrust() {
		return thrust;
	}
	public void setThrust(int thrust) {
		this.thrust = thrust;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
