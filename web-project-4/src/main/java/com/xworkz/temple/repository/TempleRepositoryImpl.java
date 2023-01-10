package com.xworkz.temple.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;

@Component
public class TempleRepositoryImpl implements TempleReposiory {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("running save method in TempleRepositoryImpl");
		System.out.println("Factory   :" + factory);

		EntityManager entityManager = this.factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}

		return true;
	}

}
