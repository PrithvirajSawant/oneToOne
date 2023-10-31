package oneToOne.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToOne.entities.Adhar;
import oneToOne.entities.Person;
import oneToOne.util.AdharUtil;
import oneToOne.util.PersonUtil;



public class create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Adhar adhar = AdharUtil.getAdhar();
		Person person = PersonUtil.getPerson();
		person.setAdhar(adhar);
		
		em.persist(adhar);
		em.persist(person);
		
		et.commit();
	}

}
