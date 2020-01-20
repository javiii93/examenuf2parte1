package ejercicioMavenExamen;

import java.util.ArrayList;

import org.hibernate.Session;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listarRatio();
	}

	private static void listarRatio() {
		Session session = sessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ArrayList<Bfplayer> result = (ArrayList<Bfplayer>) session.createQuery("from Bfplayer").list();
		session.getTransaction().commit();
		session.close();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
	}
}
