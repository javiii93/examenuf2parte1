package ejercicioMavenExamen;
// Generated 20-ene-2020 17:01:18 by Hibernate Tools 5.4.7.Final

/**
 * Weapon generated by hbm2java
 */
public class Weapon implements java.io.Serializable {

	private int weaponId;
	private String name;
	private String type;
	private int damage;
	private int accuracy;

	public Weapon() {
	}

	public Weapon(int weaponId, String name, String type, int damage, int accuracy) {
		this.weaponId = weaponId;
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.accuracy = accuracy;
	}

	public int getWeaponId() {
		return this.weaponId;
	}

	public void setWeaponId(int weaponId) {
		this.weaponId = weaponId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAccuracy() {
		return this.accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {
		return "Weapon [weaponId=" + weaponId + ", name=" + name + ", type=" + type + ", damage=" + damage
				+ ", accuracy=" + accuracy + "]";
	}

}