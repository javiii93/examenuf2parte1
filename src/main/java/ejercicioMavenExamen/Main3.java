package ejercicioMavenExamen;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertarWeapon();
	}

	public static void insertarWeapon() {
		Session session = sessionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Weapon newWeapon = new Weapon(10, "KE7", "Light Machine Gun", 23, 65);
		session.save(newWeapon);
		tx.commit();
		System.out.println("Arma insertada, " + newWeapon.toString());
		session.close();
	}
}