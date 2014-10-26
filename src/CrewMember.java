import java.util.Random;

public class CrewMember {
	
	private int leadership = 50,mechanics = 50,navigation = 50,medicine = 50,combat = 50,scavenging = 50,trade = 50,lore = 50;
	private int hp = 100, maxhp = 100;
	private String name = "No-Name";
	private enum Race {
		HUMAN, POLEMIAN, IMNAR, KRID, TRIGGLE, CHEZZERIN,
	}
	private Race race = Race.HUMAN;
	
	public CrewMember() {
		this.initRandom();
	}
	
	public CrewMember(int con) {
		/*
		 * alternate constructor
		 * if con is anything but 1, use default values
		 * mostly for test purposes
		 */
		if ( con == 1 ) {
			this.initRandom();
		}
	}
	
	//this method generates random values (for use in constructors)
	public void initRandom() {
		this.rollRace();
		this.rollName();
		this.rollStats();
		this.applyRaceMods();
		this.testSkillBounds();
	}
	
	// this method generates a random name based on the different classes
	private void rollName() {
		Random rand = new Random();
		// switchs on a random integer between 0 to 3
		// then sets the names accordingly
		switch(rand.nextInt(4)) {
			case 0:
				this.setName(NameBank.randomizeHumanName());
				break;
			case 1:
				this.setName(NameBank.randomizePolemianName());
				break;
			case 2:
				this.setName(NameBank.randomizeImnarName());
				break;
			case 3:
				this.setName(NameBank.randomizeKridName());
				break;
			default:
				// debugging
				// how did you get here?
				System.out.println("you should not EVER get here");
		}
	}
	
	// this method generates a random race
	private void rollRace() {
		Random rand = new Random();
		// switchs on a random integer between 0 to 5
		// then sets the names accordingly
		switch(rand.nextInt(6)) {
			case 0:
				this.setRace(Race.HUMAN);
				break;
			case 1:
				this.setRace(Race.POLEMIAN);
				break;
			case 2:
				this.setRace(Race.IMNAR);
				break;
			case 3:
				this.setRace(Race.KRID);
				break;
			case 4:
				this.setRace(Race.TRIGGLE);
				break;
			case 5:
				this.setRace(Race.CHEZZERIN);
				break;
			default:
				// debugging
				// how did you get here?
				System.out.println("you should not EVER get here");
		}
	}
	
	private void rollStats() {
		Random rand = new Random();
		//the good code giveth
		int mod;
		mod = rand.nextInt(20);
		this.leadership += mod;
		mod = rand.nextInt(10);
		this.mechanics += mod;
		mod = rand.nextInt(10);
		this.navigation += mod;
		mod = rand.nextInt(10);
		this.medicine += mod;
		mod = rand.nextInt(10);
		this.combat += mod;
		mod = rand.nextInt(10);
		this.scavenging += mod;
		mod = rand.nextInt(10);
		this.lore += mod;
		//and the good code taketh away
		mod = rand.nextInt(9);
		this.leadership -= mod;
		mod = rand.nextInt(9);
		this.mechanics -= mod;
		mod = rand.nextInt(9);
		this.navigation -= mod;
		mod = rand.nextInt(9);
		this.medicine -= mod;
		mod = rand.nextInt(9);
		this.combat -= mod;
		mod = rand.nextInt(9);
		this.scavenging -= mod;
		mod = rand.nextInt(9);
		this.lore -= mod;
	}

	private void applyRaceMods() {
		
		/*self-reference:
		 * HUMAN: +scavenging/trade , -mech/medicine
		 * POLEMIAN: +combat/medicine , -trade/nav
		 * IMNAR: +nav/lore , -scavenging/mech
		 * KRID: ++mech/medicine , --combat/leadership
		 * TRIGGLE: -everything (blame Shane), special events (blame Cullen)
		 * CHEZZERIN: +leadership/lore , -medicine/combat
		 */
		
		if (this.getRace() == Race.HUMAN) {
			this.medicine -= 20;
			this.mechanics -= 20;
			this.trade += 20;
			this.scavenging += 20;
		}
		
		if (this.getRace() == Race.POLEMIAN) {
			this.trade -= 20;
			this.navigation -=20;
			this.combat += 20;
			this.medicine += 20;
		}
		
		if (this.getRace() == Race.IMNAR) {
			this.scavenging -= 30;
			this.mechanics -= 10;
			this.medicine -= 10;
			this.leadership -= 10;
			this.lore += 30;
			this.navigation += 30;
		}
		
		if (this.getRace() == Race.KRID) {
			this.combat -= 40;
			this.leadership -= 40;
			this.mechanics += 40;
			this.medicine += 40;
		}
		
		if (this.getRace() == Race.TRIGGLE) {
			this.leadership -= 15;
			this.mechanics -= 15;
			this.navigation -= 15;
			this.medicine -= 15;
			this.combat -= 15;
			this.scavenging -= 15;
			this.trade -= 15;
			this.lore -= 15;
		}
		
		if (this.getRace() == Race.CHEZZERIN) {
			this.trade += 25;
			this.leadership += 15;
			this.medicine -= 20;
			this.combat -= 20;
		}
	}

	private void testSkillBounds() {
		//stat ceilings
		if ( this.getLeadership() > 100) { this.setLeadership(100); }
		if ( this.getMechanics() > 100) { this.setMechanics(100); }
		if ( this.getNavigation() > 100 ) { this.setNavigation(100); }
		if ( this.getMedicine() > 100) { this.setMedicine(100); }
		if ( this.getCombat() > 100) { this.setCombat(100); }
		if ( this.getScavenging() > 100) { this.setScavenging(100); }
		if ( this.getTrade() > 100) { this.setTrade(100); }
		if ( this.getLore() > 100) { this.setLore(100); }
		//stat floors
		if ( this.getLeadership() < 1) { this.setLeadership(1); }
		if ( this.getMechanics() < 1) { this.setMechanics(1); }
		if ( this.getNavigation() < 1) { this.setNavigation(1); }
		if ( this.getMedicine() < 1) { this.setMedicine(1); }
		if ( this.getCombat() < 1) { this.setCombat(1); }
		if ( this.getScavenging() < 1) { this.setScavenging(1); }
		if ( this.getTrade() < 1) { this.setTrade(1); }
		if ( this.getLore() < 1) { this.setLore(1); }
	}
	
	public int getHireCost() {
		int hireCost;
		hireCost = ( (this.getLeadership() + this.getMechanics() + this.getNavigation() + this.getMedicine() + this.getCombat() + this.getScavenging() + ( this.getTrade() * 3 ) + this.getLore()) * 10);
		if ( this.getRace() == Race.HUMAN ) {
			hireCost += (hireCost / 10);
		} else if (this.getRace() == Race.TRIGGLE ) {
			hireCost -= (2 * (hireCost / 10) );
		}
		return hireCost;
	}
	
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}

	public int getLeadership() {
		return leadership;
	}
	public void setLeadership(int leadership) {
		this.leadership = leadership;
	}
	
	public int getMechanics() {
		return mechanics;
	}
	public void setMechanics(int mechanics) {
		this.mechanics = mechanics;
	}
	
	public int getNavigation() {
		return navigation;
	}
	public void setNavigation(int navigation) {
		this.navigation = navigation;
	}
	
	public int getMedicine() {
		return medicine;
	}
	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}
	
	public int getCombat() {
		return combat;
	}
	public void setCombat(int combat) {
		this.combat = combat;
	}
	
	public int getScavenging() {
		return scavenging;
	}
	public void setScavenging(int scavenging) {
		this.scavenging = scavenging;
	}

	public int getTrade() {
		return trade;
	}
	public void setTrade(int trade) {
		this.trade = trade;
	}

	public int getLore() {
		return lore;
	}
	public void setLore(int lore) {
		this.lore = lore;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRaceName() {
		if ( this.getRace() == Race.HUMAN ) {
			return "Human";
		} else if ( this.getRace() == Race.IMNAR ) {
			return "Imnar";
		} else if ( this.getRace() == Race.KRID ) {
			return "Krid";
		} else if ( this.getRace() == Race.POLEMIAN ) {
			return "Polemian";
		} else if ( this.getRace() == Race.TRIGGLE ) {
			return "Triggle";
		} else return "Null Race";
	}
	
	public String showInfo() {
		return "Name: " + this.getName() + "\nRace: " + this.getRaceName() + "\nLeadership: " + this.getLeadership() + "\nMechanics: " + this.getMechanics() + "\nNavigation: " + this.getNavigation() + "\nMedicine: " + this.getMedicine() + "\nCombat: " +this.getCombat() + "\nScavenging: " + this.getScavenging() + "\nTrade:" + this.getTrade() + "\nLore:" + this.getLore();
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

}
