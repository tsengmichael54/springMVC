package com.ifbk.spring.dao;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import com.ifbk.spring.model.Student;

public class StudentJPA  {
	
	@PersistenceUnit(unitName="JMG")
	private EntityManagerFactory emf;
	
	public void StudentJPA(){
		System.out.println("StudentJPA created");
	}
	public void create(Integer id, String name, Integer age){
	
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	Student student = new Student();
	student.setId(id);
	student.setName(name);
	student.setAge(age);
	em.persist(student);
	em.getTransaction().commit();

	}
	
}
