package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Studentdto;

public class Studentdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Studentdto studentdto){
		entityTransaction.begin();
		entityManager.persist(studentdto);
		entityTransaction.commit();
	}
//	public void update(int studentid,String studentname){
//		Studentdto std= entityManager.find(Studentdto.class,studentid);
//		std.setStudentname(studentname);
//		entityTransaction.begin();
//		entityManager.merge(std);
//		entityTransaction.commit();
//	}

}
