import java.util.ArrayList;
import shipParts.*;
//import weapon.*;

public class Ship {
	private int health = 1, powerOut = 0, powerUse = 0, mass = 0, thrust = 0;
	
	//array lists for active parts and crew
	ArrayList<ShipPart> partsList = new ArrayList<ShipPart>();
	//ArrayList<Weapon> weaponsList = new ArrayList<Weapon>();
	//removed because weapon is being rewritten
	ArrayList<CrewMember> activeCrew = new ArrayList<CrewMember>();
	
	//TODO: placeholder refs for captain, nav, etc.
	
	public Ship() {
		//stuff will go here
	}
	
	public Ship(String con) {
		if(con.equalsIgnoreCase("test")) {
			partsList.add(new Reactor());
			partsList.add(new Hull());
			partsList.add(new CargoBay());
			partsList.add(new Shield());
		}
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

}
