import shipParts.*;

public class PartsList {
	/*
	 * each object of Ship should have a PartsList class
	 * PartsList is responsible for storing part information
	 * and calculating values based on that information
	 * 
	 * most methods in ship regarding part information work by
	 * calling methods in that ship's PartsList 
	 */
	
	private CargoBay[] cbList = new CargoBay[10];
	private Hull[] hullList = new Hull[10];
	private Reactor[] reactorList = new Reactor[10];
	private Shield[] shieldList = new Shield[10];
	private CrewQuarters[] cqList = new CrewQuarters[10];
	private Thruster[] thrusterList = new Thruster[10];
	private int cargoBayIndex = 0, hullIndex = 0, reactorIndex = 0, shieldIndex = 0, cqIndex = 0, thrusterIndex = 0;
	
	public PartsList() {
		cbList[0] = new CargoBay();
		hullList[0] = new Hull();
		reactorList[0] = new Reactor();
		//shieldList[0] = new Shield();
		cqList[0] = new CrewQuarters();
		thrusterList[0] = new Thruster();
		thrusterList[1] = new Thruster();
		cargoBayIndex = 1;
		hullIndex = 1;
		reactorIndex = 1;
		//shieldIndex = 1;
		cqIndex = 1;
		thrusterIndex = 2;
	}
	
	//calculation codes
	
	public int calcMass() {
		int total = 0, i;
		for (i = 0; i < cargoBayIndex; i++) {
			total += cbList[i].getMass();
		}
		for (i = 0; i < hullIndex; i++) {
			total += hullList[i].getMass();
		}
		for (i = 0; i < reactorIndex; i++) {
			total += reactorList[i].getMass();
		}
		for (i = 0; i < shieldIndex; i++) {
			total += shieldList[i].getMass();
		}
		for (i = 0; i < cqIndex; i++) {
			total += cqList[i].getMass();
		}
		for (i = 0; i < thrusterIndex; i++) {
			total += thrusterList[i].getMass();
		}
		return total;
	}
	
	public int calcPrice() {
		//TODO: find out what's wrong with calcPrice
		int total = 0, i;
		for (i = 0; i < cargoBayIndex; i++) {
			total += cbList[i].getPrice();
		}
		for (i = 0; i < hullIndex; i++) {
			total += hullList[i].getPrice();
		}
		for (i = 0; i < reactorIndex; i++) {
			total += reactorList[i].getPrice();
		}
		for (i = 0; i < shieldIndex; i++) {
			total += shieldList[i].getPrice();
		}
		for (i = 0; i < cqIndex; i++) {
			total += cqList[i].getPrice();
		}
		for (i = 0; i < thrusterIndex; i++) {
			total += thrusterList[i].getPrice();
		}
		return total;
	}
	
	public int calcPowerUse() {
		int total = 0, i;
		for (i = 0; i < cargoBayIndex; i++) {
			total += cbList[i].getPowerUse();
		}
		for (i = 0; i < hullIndex; i++) {
			total += hullList[i].getPowerUse();
		}
		for (i = 0; i < reactorIndex; i++) {
			total += reactorList[i].getPowerUse();
		}
		for (i = 0; i < shieldIndex; i++) {
			total += shieldList[i].getPowerUse();
		}
		for (i = 0; i < cqIndex; i++) {
			total += cqList[i].getPowerUse();
		}
		for (i = 0; i < thrusterIndex; i++) {
			total += thrusterList[i].getPowerUse();
		}
		return total;
	}
	
	//calculations for part-specific numbers
	
	public int calcPowerOutput() {
		int total = 0;
		for (int i = 0; i < reactorIndex; i++) {
			total += reactorList[i].getPowerOutput();
		}
		return total;
	}
	
	public int calcShield() {
		int total = 0;
		for (int i = 0; i < shieldIndex; i++) {
			total += shieldList[i].getShield();
		}
		return total;
	}
	
	public int calcCargoCap() {
		int total = 0;
		for (int i = 0; i < cargoBayIndex; i++) {
			total += cbList[i].getCapacity();
		}
		return total;
	}
	
	public int calcCrewCap() {
		int total = 0;
		for (int i = 0; i < cargoBayIndex; i++) {
			total += cqList[i].getCapacity();
		}
		return total;
	}
	
	public int calcThrust() {
		int total = 0;
		for (int i = 0; i < thrusterIndex; i++) {
			total += thrusterList[i].getThrust();
		}
		return total;
	}

	//add and remove methods for part types
	
	public void addCB(CargoBay newCB) {
		if (cargoBayIndex > (cbList.length - 1) ) {
			System.out.println("ERROR: cannot add more cargo bays.");
			return;
		}
		cbList[cargoBayIndex] = newCB;
		cargoBayIndex++;
	}
	
	public void removeCB(int i) {
		cbList[i] = null;
		cargoBayIndex--;
		if (i != (cbList.length - 1) ) {
			//if removed reactor was not in final index,
			for (int j = i; j < (cbList.length - 1); j++) {
				//for each index j at and after index i, check for a cargobay in j+1
				//if a cargobay is found, copy it into j and set j+1 to null
				if (cbList[j+1] != null) {
					//set index j equal to j + 1
					cbList[j] = cbList[j+1];
					cbList[j+1] = null;
				}
			}
		}
	}
	
	public void addHull(Hull newHull) {
		if (hullIndex > 9) {
			System.out.println("ERROR: cannot add more hulls.");
			return;
		}
		hullList[hullIndex] = newHull;
		hullIndex++;
	}
	
	public void removeHull(int i) {
		hullList[i] = null;
		hullIndex--;
		if (i != (hullList.length - 1) ) {
			//if removed reactor was not in final index,
			for (int j = i; j < (hullList.length - 1); j++) {
				//for each index j at and after index i, check for a hull in j+1
				//if a hull is found, copy it into j and set j+1 to null
				if (hullList[j+1] != null) {
					//set index j equal to j + 1
					hullList[j] = hullList[j+1];
					hullList[j+1] = null;
				}
			}
		}
	}
	
	public void addReactor(Reactor newReactor) {
		if (reactorIndex > 9) {
			System.out.println("ERROR: YOU CAN'T ADD ANY MORE REACTORS");
			return;
		}
		reactorList[reactorIndex] = newReactor;
		reactorIndex++;
	}
	
	public void removeReactor(int i) {
		reactorList[i] = null;
		reactorIndex--;
		if (i != (reactorList.length - 1) ) {
			//if removed reactor was not in final index,
			for (int j = i; j < (reactorList.length - 1); j++) {
				//for each index j at and after index i, check for a reactor in j+1
				//if a reactor is found, copy it into j and set j+1 to null
				if (reactorList[j+1] != null) {
					//set index j equal to j + 1
					reactorList[j] = reactorList[j+1];
					reactorList[j+1] = null;
				}
			}
		}
	}
	
	public void addCQ(CrewQuarters newCQ) {
		if (cqIndex > (cqList.length - 1) ) {
			System.out.println("ERROR: cannot add more crew quarters.");
			return;
		}
		cqList[cqIndex] = newCQ;
		cqIndex++;
	}
	
	public void removeCQ(int i) {
		cqList[i] = null;
		cqIndex--;
		if (i != (cqList.length - 1) ) {
			//if removed reactor was not in final index,
			for (int j = i; j < (cqList.length - 1); j++) {
				//for each index j at and after index i, check for a crew quarter in j+1
				//if a crew quarter is found, copy it into j and set j+1 to null
				if (cqList[j+1] != null) {
					//set index j equal to j + 1
					cqList[j] = cqList[j+1];
					cqList[j+1] = null;
				}
			}
		}
	}
	
	public void addThruster(Thruster newThruster) {
		if (thrusterIndex > (thrusterList.length - 1) ) {
			System.out.println("ERROR: cannot add more thrusters.");
			return;
		}
		thrusterList[thrusterIndex] = newThruster;
		thrusterIndex++;
	}
	
	public void removeThruster(int i) {
		thrusterList[i] = null;
		thrusterIndex--;
		if (i != (thrusterList.length - 1) ) {
			//if removed thruster was not in final index,
			for (int j = i; j < (thrusterList.length - 1); j++) {
				//for each index j at and after index i, check for a thruster in j+1
				//if a thruster is found, copy it into j and set j+1 to null
				if (thrusterList[j+1] != null) {
					//set index j equal to j + 1
					thrusterList[j] = thrusterList[j+1];
					thrusterList[j+1] = null;
				}
			}
		}
	}
	
	//test classes
	public void listReactors() {
		for (int i = 0; i < reactorList.length; i++) {
			System.out.println(reactorList[i]);
		}
	}
	public void listHulls() {
		for (int i = 0; i < hullList.length; i++) {
			System.out.println(hullList[i]);
		}
	}
	public void listShields() {
		for (int i = 0; i < shieldList.length; i++) {
			System.out.println(shieldList[i]);
		}
	}
	public void listCargoBays() {
		for (int i = 0; i < cbList.length; i++) {
			System.out.println(cbList[i]);
		}
	}
	
	
}