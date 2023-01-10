package com.xworkz.bike.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bike.dto.BikeDTO;

@Component
public class BikeRepositoryImpl implements BikeRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(BikeDTO dto) {
		System.out.println("running save method");
		System.out.println("Factory    :" + factory);
		EntityManager createEntityManager = this.factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return true;
	}

}
