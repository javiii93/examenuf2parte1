package ejercicioMavenExamen;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
insertarJugador();
	}
	public static void insertarJugador() {
		Session session = sessionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Bfplayer player=new Bfplayer();
		player.setUserId("lerelera");
		player.setClassId(2);
		player.setPrimaryWeapon(10);
		player.setDevice1(4);
		session.save(player);
		tx.commit();
		session.close();
		System.out.println("Jugador insertado, userid=" + player.getUserId()+", class="+player.getClassId()+", arma principal="+player.getPrimaryWeapon()+", device="+player.getDevice1()+", kills="+player.getKills()+", deads="+player.getDeads());
	}
}
//CONSULTA: Inserta un nou jugador amb clase “suport” asigna-li com a arma la KE7 i com
//a dispositu l’ “Ammo Pouch” i mostra aquest jugador amb totes les seves característiques (1 punts) 
