package shipParts;

public abstract class Weapon {
	private int damage;
	
	public void setDamage(int newDamage) {
		this.damage = newDamage;
	}
	public int getDamage() {
		return damage;
	}
}
