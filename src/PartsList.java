import shipParts.*;

public class PartsList {
	private CargoBay[] cbList = new CargoBay[10];
	private Hull[] hullList = new Hull[10];
	private Reactor[] reactorList = new Reactor[10];
	private Shield[] shieldList = new Shield[10];
	private int cargoBayIndex = 0, hullIndex = 0, reactorIndex = 0, shieldIndex = 0;
	
	public PartsList() {
		cbList[0] = new CargoBay();
		hullList[0] = new Hull();
		reactorList[0] = new Reactor();
		shieldList[0] = new Shield();
		cargoBayIndex = 1;
		hullIndex = 1;
		reactorIndex = 1;
		shieldIndex = 1;
	}
	
	//calculation code past this point
	
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
		return total;
	}
	
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
		if (i != 9) {
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
		i--;
	}
	
}
