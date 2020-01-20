package ejercicioMavenExamen;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main5 {
	/*
	 DELIMITER //
	  
	  CREATE PROCEDURE borrarPlayersid3() BEGIN DELETE FROM bfplayer where
	  class_id>3; END //
	  
	  DELIMITER ;
	 */

	public static void main(String[] args) {
		callProcedure();
	}

	public static void callProcedure() {
		Session session = sessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.createQuery("call borrarPlayersid3");
		session.getTransaction().commit();
		session.close();

	}
}
