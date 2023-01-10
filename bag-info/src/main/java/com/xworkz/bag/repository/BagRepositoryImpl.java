package com.xworkz.bag.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bag.dto.BagDTO;

@Component
public class BagRepositoryImpl implements BagRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(BagDTO dto) {
		System.out.println("running save method ");
		EntityManager entityManager = this.factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
		return true;
	}

}
