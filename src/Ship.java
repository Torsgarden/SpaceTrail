import java.util.ArrayList;
import shipParts.*;

public class Ship {
	private String name = NameBank.randomizeShipName();
	private int powerOut = 0, powerUse = 0, mass = 0, thrust = 0, price = 0, crewCap = 0, cargoCap = 0;
	private Double speed;
	private int health = 1, healthMax = 1, shield = 0, shieldMax = 0;
	
	//PartsList is like an array list specifically for ship parts
	PartsList pL = new PartsList();
	//array list for active crew
	ArrayList<CrewMember> activeCrew = new ArrayList<CrewMember>();
	
	//TODO: proper system for captain, nav, etc.
	CrewMember captain = new CrewMember(), navigator = new CrewMember();
	
	public Ship() {
		this.calcSpecs();
	}
	
	public void calcSpecs() {
		mass = pL.calcMass();
		powerUse = pL.calcPowerUse();
		powerOut = pL.calcPowerOutput();
		crewCap = pL.calcCrewCap();
		shieldMax = pL.calcShield();
		cargoCap = pL.calcCargoCap();
		thrust = pL.calcThrust();
		speed = calcSpeed();
	}
	
	//test class: prints all ship specs to the console
	public void outputSpecs() {
		System.out.println("Ship: " + name);
		System.out.println("Fits " + crewCap + " crew.");
		System.out.println("Total mass: " + mass);
		System.out.println("Thruster Power: " + thrust);
		System.out.println("Captain's leadership: " + captain.getLeadership());
		System.out.println("Navigators skill: " + navigator.getNavigation());
		System.out.println("Ship speed: " + speed);
		System.out.println("Can carry " + cargoCap + " kilos of cargo.");
		System.out.println("Net power generation: " + powerOut);
		System.out.println("Net power usage: " + powerUse);
		System.out.println("Shield power: " + shieldMax);
	}
	
	public String getSpecsString() {
		String output = ("Mass: " + mass + "\nPower Usage: " + powerUse + "\nPower Generation: " + powerOut);
		//TODO: change specs string as more ship parts are added
		return output;
	}
	
	public Double calcSpeed() {
		Double speedBase, speedMod, speedAdjusted;
		speedBase = 1.0 *  getThrust() - getMass();
		speedMod = (1.0 * captain.getLeadership() + navigator.getNavigation())/100;
		speedAdjusted = speedBase * speedMod;
		if (speedAdjusted < 0.0)
			return 0.0;
		return speedAdjusted;
	}
	
	//add and remove methods for ship parts
	
	public void addHull(Hull newHull) {
		pL.addHull(newHull);
	}
	public void removeHull(int i) {
		pL.removeHull(i);
	}
	
	public void addReactor(Reactor newReactor) {
		pL.addReactor(newReactor);
	}
	public void removeReactor(int i) {
		pL.removeReactor(i);
	}
	
	public void addCargoBay(CargoBay newCB) {
		pL.addCB(newCB);
	}
	public void removeCargoBay(int i) {
		pL.removeCB(i);
	}
	
	public void addCrewQuarters(CrewQuarters newCQ) {
		pL.addCQ(newCQ);
	}
	public void removeCrewQuarters(int i) {
		pL.removeCQ(i);
	}
	
	public void addThruster(Thruster newThruster) {
		pL.addThruster(newThruster);
	}
	public void removeThruster(int i) {
		pL.removeThruster(i);
	}
	
	//hp and shield methods
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int newHealth) {
		health = newHealth;
	}
	public void modHealth(int change) {
		health += change;
	}

	//getters and setters
	
	public int getPowerOut() {
		return powerOut;
	}
	public void setPowerOut(int newPowerOut) {
		powerOut = newPowerOut;
	}

	public int getPowerUse() {
		return powerUse;
	}
	public void setPowerUse(int newPowerUse) {
		powerUse = newPowerUse;
	}

	public int getMass() {
		return mass;
	}
	public void setMass(int newMass) {
		mass = newMass;
	}

	public int getThrust() {
		return thrust;
	}
	public void setThrust(int newThrust) {
		thrust = newThrust;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}

}
