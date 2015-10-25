public class Ship {
	private String Name = "The ship with no name";
	private int maxWeight = 0, maxHP = 1, hp = 1, crewLimit = 1, crewCurrent = 0;
	
	public Ship() {
		this.rollName();
	}
	
	private void rollName() {
		this.setName( NameBank.randomizeShipName() );
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getCrewLimit() {
		return crewLimit;
	}

	public void setCrewLimit(int crewLimit) {
		this.crewLimit = crewLimit;
	}
	
	public int getCrewCurrent() {
		return crewCurrent;
	}

	public void setCrewCurrent(int crewCurrent) {
		this.crewCurrent = crewCurrent;
	}

	
	
	
}
